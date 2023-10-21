api-personagens is an API that saves and retrieves DnD characters stats on a postgresql database.

It was developed in Java SpringBoot with maven and is available at https://api-personagens-production.up.railway.app by the time of this commit.

Request example:

POST - creates a new character in the database (/personagens)

body: ```{
  "name": "Grog",
  "hp": 225,
  "armorClass": 19,
  "difficultyClass": 18,
  "strength": 20,
  "dexterity": 14,
  "constitution": 18,
  "intelligence": 7,
  "wisdom": 10,
  "charisma": 8
}```

GET - returns the stats of a character based on it's id (/personagens/6)

--

Api feita em Java SpringBoot com maven e rodando em https://api-personagens-production.up.railway.app até o momento deste commit.

Exemplo de requisição:

POST - cria um novo objeto no database (/personagens)

body: ```{
  "name": "Grog",
  "hp": 225,
  "armorClass": 19,
  "difficultyClass": 18,
  "strength": 20,
  "dexterity": 14,
  "constitution": 18,
  "intelligence": 7,
  "wisdom": 10,
  "charisma": 8
}```

GET - retorna os status de um personagem baseado no id (/personagens/6)
