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

}
