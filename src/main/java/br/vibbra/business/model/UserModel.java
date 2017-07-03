package br.vibbra.business.model;

import java.util.List;

import br.vibbra.basic.entity.User;
import br.vibbra.business.exception.SignInException;

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

	UserModel login() throws SignInException;

	void setId(Long id);

}
