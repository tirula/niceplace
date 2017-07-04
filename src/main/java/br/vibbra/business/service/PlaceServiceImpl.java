package br.vibbra.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.vibbra.business.model.PlaceModel;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Service
public class PlaceServiceImpl implements PlaceService {

	@Autowired
	private PlaceModel placeModel;

	@Override
	@Transactional
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

	@Override
	@Transactional
	public void retrieveAll() {
		placeModel.retrieveAll();
	}

}
