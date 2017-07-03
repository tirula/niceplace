package br.vibbra.business.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.basic.dao.PlaceDao;
import br.vibbra.basic.entity.Place;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class PlaceBusiness implements PlaceModel {

	@Autowired
	private PlaceDao placeDao;

	private List<Place> places;

	private String name;

	@Override
	public PlaceModel findByName() {
		places = placeDao.findByName(getName());
		return this;
	}

	@Override
	public PlaceModel retrieveAll() {
		places = placeDao.findAll();
		return this;
	}

	@Override
	public List<Place> getPlaces() {
		return places;
	}

	public void setPlaces(List<Place> places) {
		this.places = places;
	}

	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

}
