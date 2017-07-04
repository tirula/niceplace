package br.vibbra.business.service;

import br.vibbra.business.model.UserPlaceModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface UserPlaceService {

	void retrieveAll();

	UserPlaceModel getUserPlaceModel();

	void setUserPlaceModel(UserPlaceModel userPlaceModel);

	void rating();

	void retrieveAllByUser();

}
