package br.vibbra.business.model;

import java.util.List;

import br.vibbra.basic.entity.User;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
public interface UserModel {

	UserModel retrieveAll();

	List<User> getUsers();

	UserModel save();

	UserModel delete();

	void setPassword(String password);

	void setUsername(String username);

	void setId(Long id);

}
