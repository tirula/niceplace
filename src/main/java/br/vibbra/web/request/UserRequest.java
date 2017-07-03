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
	private static final long serialVersionUID = -5816366688151150839L;

	private String username;

	private String password;

	public UserRequest() {
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
