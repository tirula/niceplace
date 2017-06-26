package br.vibbra.repository;

import org.springframework.stereotype.Repository;

import entity.User;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
