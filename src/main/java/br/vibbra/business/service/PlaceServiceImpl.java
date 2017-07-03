package br.vibbra.business.service;

import org.springframework.stereotype.Component;

import br.vibbra.business.model.PlaceModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class PlaceServiceImpl implements PlaceService {

	private PlaceModel placeModel;

	@Override
	public void findByname() {
		placeModel.findByName();
	}

	@Override
	public PlaceModel getPlaceModel() {
		return placeModel;
	}

	public void setPlaceModel(PlaceModel placeModel) {
		this.placeModel = placeModel;
	}

}
