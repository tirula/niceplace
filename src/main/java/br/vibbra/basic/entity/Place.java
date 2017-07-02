package br.vibbra.basic.entity;

import java.io.Serializable;
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
@Entity
@Table(name = "PLACE")
public class Place implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -5686132833620890931L;

	@Id
	@Column(name = "PLACE_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "NAME", nullable = false, length = 50)
	private String name;

	@Column(name = "PHONE", nullable = false, length = 20)
	private String phoneNumber;

	@Column(name = "TYPE")
	@Enumerated(EnumType.STRING)
	private TypePlace typePlace;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pk.place")
	private Set<UserPlace> userPlaces;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public TypePlace getTypePlace() {
		return typePlace;
	}

	public void setTypePlace(TypePlace typePlace) {
		this.typePlace = typePlace;
	}

	public Set<UserPlace> getUserPlaces() {
		return userPlaces;
	}

	public void setUserPlaces(Set<UserPlace> userPlaces) {
		this.userPlaces = userPlaces;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
		result = prime * result + ((typePlace == null) ? 0 : typePlace.hashCode());
		result = prime * result + ((userPlaces == null) ? 0 : userPlaces.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Place other = (Place) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		if (typePlace != other.typePlace)
			return false;
		if (userPlaces == null) {
			if (other.userPlaces != null)
				return false;
		} else if (!userPlaces.equals(other.userPlaces))
			return false;
		return true;
	}

}
