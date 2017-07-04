package br.vibbra.business.model;

import java.util.List;

import br.vibbra.basic.entity.Place;
import br.vibbra.basic.enums.TypePlace;

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

	void setAddress(String address);

	void setCity(String city);

	void setPhone(String phone);

	void setCountry(String country);

	PlaceModel save();

	void setTypePlace(TypePlace typePlace);
}
