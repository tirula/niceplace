package br.vibbra.business.service;

import br.vibbra.business.model.PlaceModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface PlaceService {

	void findByname();

	PlaceModel getPlaceModel();

	void retrieveAll();

	void save();

	void setPlaceModel(PlaceModel placeModel);
}
