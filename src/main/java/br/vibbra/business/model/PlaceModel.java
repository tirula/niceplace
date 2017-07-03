package br.vibbra.business.model;

import java.util.List;

import br.vibbra.basic.entity.Place;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface PlaceModel {

	PlaceModel findByName();

	void setName(String name);

	List<Place> getPlaces();

	PlaceModel retrieveAll();
}
