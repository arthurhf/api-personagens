package dio.bootcamp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.bootcamp.model.dao.PersonagemDAO;

@Repository
public interface PersonagemRepository extends JpaRepository<PersonagemDAO, Long> {

}
