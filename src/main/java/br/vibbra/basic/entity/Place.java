package br.vibbra.basic.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import br.vibbra.basic.enums.TypePlace;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Table
@Entity(name = "place")
public class Place implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "place_id")
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "address")
	private String address;

	@Column(name = "city")
	private String city;

	@Column(name = "country")
	private String country;

	@Column(name = "type_place")
	@Enumerated(EnumType.STRING)
	private TypePlace typePlace;

	@Column(name = "phone")
	private String phone;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.place")
	private Set<UserPlace> userPlaces = new HashSet<>();

	public Place() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public TypePlace getTypePlace() {
		return typePlace;
	}

	public void setTypePlace(TypePlace typePlace) {
		this.typePlace = typePlace;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Set<UserPlace> getUserPlaces() {
		return userPlaces;
	}

	public void setUserPlaces(Set<UserPlace> userPlaces) {
		this.userPlaces = userPlaces;
	}

}
