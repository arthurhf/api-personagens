package dio.bootcamp.service;

import dio.bootcamp.model.dao.PersonagemDAO;

public interface UserService {

	PersonagemDAO findById(Long id);
	
	PersonagemDAO create(PersonagemDAO personagem);
}
