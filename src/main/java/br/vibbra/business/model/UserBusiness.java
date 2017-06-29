package br.vibbra.business.model;

import java.util.List;

import org.springframework.stereotype.Component;

import br.vibbra.basic.entity.User;
import br.vibbra.basic.repository.CrudRepository;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
@Component
public class UserBusiness implements UserModel {

	private CrudRepository<User, Long> userRepository;

	private List<User> users;

	@Override
	public UserModel retrieveAll() {
		userRepository.findAll();
		return this;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
