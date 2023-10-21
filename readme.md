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
