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
	@Transactional
	public void retrieveAll() {
		placeModel.retrieveAll();
	}

	@Override
	@Transactional
	public void save() {
		placeModel.save();
	}

	@Override
	public PlaceModel getPlaceModel() {
		return placeModel;
	}

	@Override
	public void setPlaceModel(PlaceModel placeModel) {
		this.placeModel = placeModel;
	}
}
