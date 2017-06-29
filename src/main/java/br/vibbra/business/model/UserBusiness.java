package br.vibbra.business.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.basic.UserDao;
import br.vibbra.basic.entity.User;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
@Component
public class UserBusiness implements UserModel {

	@Autowired
	private UserDao userDao;

	private List<User> users;

	@Override
	public UserModel retrieveAll() {
		this.users = userDao.findAll();
		return this;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
