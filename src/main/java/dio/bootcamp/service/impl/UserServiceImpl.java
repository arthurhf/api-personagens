package dio.bootcamp.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import dio.bootcamp.model.dao.PersonagemDAO;
import dio.bootcamp.repository.PersonagemRepository;
import dio.bootcamp.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private final PersonagemRepository personagemRepository;
	
	public UserServiceImpl(PersonagemRepository personagemRepository) {
		this.personagemRepository = personagemRepository;
	}

	@Override
	public PersonagemDAO findById(Long id) {
		// TODO Auto-generated method stub
		return personagemRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public PersonagemDAO create(PersonagemDAO personagem) {
		if(personagem.getId() !=null && personagemRepository.existsById(personagem.getId())) {
			throw new IllegalArgumentException("Este personagem já existe!");
		}
		// TODO Auto-generated method stub
		return personagemRepository.save(personagem);
	}

}
