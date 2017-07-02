package br.vibbra.web.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.business.model.UserModel;
import br.vibbra.web.request.UserRequest;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class UserMapper implements Mapper<UserModel, UserRequest> {

	@Autowired
	private UserModel model;

	@Override
	public UserModel map(UserRequest request) {
		model.setName(request.getName());
		model.setEmail(request.getEmail());
		model.setPassword(request.getPassword());
		return model;
	}

	public UserModel getModel() {
		return model;
	}

	public void setModel(UserModel model) {
		this.model = model;
	}
}
