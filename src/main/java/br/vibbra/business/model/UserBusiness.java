package br.vibbra.business.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.basic.UserDao;
import br.vibbra.basic.entity.User;
import br.vibbra.business.exception.SignInException;

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

	private Long id;

	private String name;

	private String email;

	private String password;

	@Override
	public UserModel retrieveAll() {
		this.users = userDao.findAll();
		return this;
	}

	@Override
	public UserModel save() {
		User user = new User();
		user.setEmail(getEmail());
		user.setName(getName());
		user.setPassword(getPassword());
		userDao.save(user);
		return this;
	}

	@Override
	public UserModel delete() {
		User user = userDao.getById(getId());
		userDao.delete(user);
		return this;
	}

	@Override
	public UserModel login() throws SignInException {
		if (!userDao.login(getEmail(), getPassword())) {
			throw new SignInException("Nao foi possivel logar no sistema.");
		}
		return this;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

}
