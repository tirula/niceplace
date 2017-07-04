package br.vibbra.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.vibbra.business.model.UserPlaceModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Service
public class UserPlaceServiceImpl implements UserPlaceService {

	@Autowired
	private UserPlaceModel userPlaceModel;

	@Override
	@Transactional
	public void rating() {
		userPlaceModel.rating();
	}

	@Override
	@Transactional
	public void retrieveAll() {
		userPlaceModel.retrieveAll();
	}

	@Override
	@Transactional
	public void retrieveAllByUser() {
		userPlaceModel.retrieveAllByUser();
	}

	@Override
	public UserPlaceModel getUserPlaceModel() {
		return userPlaceModel;
	}

	@Override
	public void setUserPlaceModel(UserPlaceModel userPlaceModel) {
		this.userPlaceModel = userPlaceModel;
	}

}
