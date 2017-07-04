package br.vibbra.business.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.vibbra.basic.dao.PlaceDao;
import br.vibbra.basic.entity.Place;
import br.vibbra.basic.enums.TypePlace;

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

	private String address;

	private String city;

	private String phone;

	private String country;

	private TypePlace typePlace;

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
	public PlaceModel save() {
		Place place = new Place();
		place.setAddress(getAddress());
		place.setCity(getCity());
		place.setCountry(getCountry());
		place.setName(getName());
		place.setTypePlace(getTypePlace());

		placeDao.save(place);
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

	public String getAddress() {
		return address;
	}

	@Override
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	public TypePlace getTypePlace() {
		return typePlace;
	}

	@Override
	public void setTypePlace(TypePlace typePlace) {
		this.typePlace = typePlace;
	}

}
