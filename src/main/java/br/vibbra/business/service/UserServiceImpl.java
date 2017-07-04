package br.vibbra.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.vibbra.business.model.UserModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserModel userModel;

	@Override
	@Transactional
	public void retrieveAll() {
		userModel.retrieveAll();
	}

	@Override
	@Transactional
	public void save() {
		userModel.save();
	}

	@Override
	public UserModel getUserModel() {
		return userModel;
	}

	@Override
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
}
