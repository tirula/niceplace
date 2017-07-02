package br.vibbra.basic.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Embeddable
public class UserPlaceId implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = -6963983798805292812L;

	@ManyToOne
	private User user;

	@ManyToOne
	private Place place;

	public UserPlaceId() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		UserPlaceId other = (UserPlaceId) obj;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserPlaceId [user=" + user + ", place=" + place + "]";
	}

}
