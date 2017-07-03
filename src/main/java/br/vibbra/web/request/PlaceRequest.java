package br.vibbra.web.request;

import java.io.Serializable;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public class PlaceRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1614821357335534971L;

	private String name;

	private String address;

	private String city;

	private String phone;

	private String country;

	public PlaceRequest() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "PlaceRequest [name=" + name + "]";
	}

}
