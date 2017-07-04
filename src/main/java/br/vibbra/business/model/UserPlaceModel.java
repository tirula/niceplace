package br.vibbra.business.model;

import java.util.List;

import br.vibbra.basic.entity.UserPlace;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public interface UserPlaceModel {

	UserPlaceModel retrieveAll();

	List<UserPlace> getUserPlaces();

	UserPlaceModel rating();

	void setUsername(String username);

	void setPlaceID(Long placeID);

	void setFoods(String foods);

	void setDrinks(String drinks);

	void setWaiter(float waiter);

	void setBill(float bill);

	void setConfortable(float confortable);

	void setNoisy(float noisy);

	void setTotal(float total);

	void setInternet(String internet);

}
