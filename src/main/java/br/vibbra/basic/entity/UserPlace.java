package br.vibbra.basic.entity;
/**
 * 
 * @author Brunno de Almeida Santos

 *
 */

import java.beans.Transient;
import java.io.Serializable;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user_place")
@AssociationOverrides({ @AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "username")),
		@AssociationOverride(name = "pk.place", joinColumns = @JoinColumn(name = "CATEGORY_ID")) })
public class UserPlace implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4301998912122390671L;

	@EmbeddedId
	private UserPlaceId pk = new UserPlaceId();

	public UserPlaceId getPk() {
		return pk;
	}

	public void setPk(UserPlaceId pk) {
		this.pk = pk;
	}

	@Transient
	public User getUser() {
		return pk.getUser();
	}

	public void setUser(User user) {
		this.pk.setUser(user);
	}

	@Transient
	public Place getPlace() {
		return pk.getPlace();
	}

	public void setPlace(Place place) {
		this.pk.setPlace(place);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
		UserPlace other = (UserPlace) obj;
		if (pk == null) {
			if (other.pk != null)
				return false;
		} else if (!pk.equals(other.pk))
			return false;
		return true;
	}

}
