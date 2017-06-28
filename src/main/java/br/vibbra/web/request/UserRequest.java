package br.vibbra.web.request;

import java.io.Serializable;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 */
public class UserRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4740961941601970896L;

	private String login;

	private String password;

	public UserRequest() {
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRequest [login=" + login + ", password=*********]";
	}
}
