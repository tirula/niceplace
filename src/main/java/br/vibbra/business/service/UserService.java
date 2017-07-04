package br.vibbra.business.service;

import br.vibbra.business.model.UserModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface UserService {

	void retrieveAll();

	UserModel getUserModel();

	void setUserModel(UserModel userModel);

	void save();

}
