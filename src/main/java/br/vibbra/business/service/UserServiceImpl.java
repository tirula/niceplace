package br.vibbra.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.vibbra.basic.entity.User;
import br.vibbra.basic.repository.CrudRepository;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private CrudRepository<User, Long> userRepository;

	@Override
	public void retrieveAll() {
		userRepository.findAll();
		// userModel.retrieveAll();
	}

}
