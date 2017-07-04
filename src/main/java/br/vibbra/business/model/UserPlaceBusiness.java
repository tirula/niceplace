package br.vibbra.business.model;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.basic.dao.PlaceDao;
import br.vibbra.basic.dao.UserDao;
import br.vibbra.basic.dao.UserPlaceDao;
import br.vibbra.basic.entity.Place;
import br.vibbra.basic.entity.User;
import br.vibbra.basic.entity.UserPlace;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Component
public class UserPlaceBusiness implements UserPlaceModel {

	@Autowired
	private UserPlaceDao userPlaceDao;

	@Autowired
	private UserDao userDao;

	@Autowired
	private PlaceDao placeDao;

	private List<UserPlace> userPlaces;

	private String username;

	private Long placeID;

	private String foods;

	private String drinks;

	private float waiter;

	private float bill;

	private float confortable;

	private float noisy;

	private float total;

	private String internet;

	@Override
	public UserPlaceModel retrieveAll() {
		userPlaces = userPlaceDao.findAll();
		return this;
	}

	@Override
	public UserPlaceModel rating() {
		UserPlace userPlace = new UserPlace();

		User user = userDao.findByUsername(getUsername());
		userPlace.setUser(user);

		Place place = placeDao.getById(placeID);
		userPlace.setPlace(place);
		userPlace.setBill(getBill());
		userPlace.setConfortable(getConfortable());
		userPlace.setCreatedDate(new Date());
		userPlace.setDrinks(getDrinks());
		userPlace.setFoods(getFoods());
		userPlace.setInternet(getInternet());
		userPlace.setNoisy(getNoisy());
		userPlace.setTotal(getTotal());
		userPlace.setWaiter(getWaiter());

		userPlaceDao.save(userPlace);
		return this;
	}

	@Override
	public void retrieveAllByUser() {
		userPlaces = userPlaceDao.findAllByUser(getUsername());
	}

	@Override
	public List<UserPlace> getUserPlaces() {
		return userPlaces;
	}

	public void setUserPlaces(List<UserPlace> userPlaces) {
		this.userPlaces = userPlaces;
	}

	public UserPlaceDao getUserPlaceDao() {
		return userPlaceDao;
	}

	public void setUserPlaceDao(UserPlaceDao userPlaceDao) {
		this.userPlaceDao = userPlaceDao;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public void setUsername(String username) {
		this.username = username;
	}

	public Long getPlaceID() {
		return placeID;
	}

	@Override
	public void setPlaceID(Long placeID) {
		this.placeID = placeID;
	}

	public String getFoods() {
		return foods;
	}

	@Override
	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getDrinks() {
		return drinks;
	}

	@Override
	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public float getWaiter() {
		return waiter;
	}

	@Override
	public void setWaiter(float waiter) {
		this.waiter = waiter;
	}

	public float getBill() {
		return bill;
	}

	@Override
	public void setBill(float bill) {
		this.bill = bill;
	}

	public float getConfortable() {
		return confortable;
	}

	@Override
	public void setConfortable(float confortable) {
		this.confortable = confortable;
	}

	public float getNoisy() {
		return noisy;
	}

	@Override
	public void setNoisy(float noisy) {
		this.noisy = noisy;
	}

	public float getTotal() {
		return total;
	}

	@Override
	public void setTotal(float total) {
		this.total = total;
	}

	public String getInternet() {
		return internet;
	}

	@Override
	public void setInternet(String internet) {
		this.internet = internet;
	}

}
