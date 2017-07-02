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

	private String name;

	private String email;

	private String password;

	public UserRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserRequest [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}
