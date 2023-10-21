package dio.bootcamp.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import dio.bootcamp.model.dao.PersonagemDAO;
import dio.bootcamp.service.UserService;

@RestController
@RequestMapping("/personagens")
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PersonagemDAO> findById(@PathVariable Long id){
		
		PersonagemDAO personagem = userService.findById(id);
		
		return ResponseEntity.ok(personagem);
		
	}
	
	@PostMapping
	public ResponseEntity<PersonagemDAO> create(@RequestBody PersonagemDAO personagem){
		PersonagemDAO personagemCriado = userService.create(personagem);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(personagemCriado.getId())
				.toUri();
		return ResponseEntity.created(location).body(personagemCriado);
	}

}
