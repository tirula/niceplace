package br.vibbra.basic.repository;

import org.springframework.data.repository.CrudRepository;

import br.vibbra.basic.entity.User;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface UserRepository extends CrudRepository<User, Long> {

}
