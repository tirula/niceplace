package br.vibbra.basic.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */

@Entity
@Table(name = "USER_PLACE")
@AssociationOverrides({ @AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "USER_ID")), @AssociationOverride(name = "pk.place", joinColumns = @JoinColumn(name = "PLACE_ID")) })
public class UserPlace implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 8774936887379022854L;

	@EmbeddedId
	private UserPlaceId pk = new UserPlaceId();

	@Column(name = "SCORE")
	private int score;

	@Column(name = "RATED_DATE", nullable = false, length = 10)
	private Date ratedDate;

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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Date getRatedDate() {
		return ratedDate;
	}

	public void setRatedDate(Date ratedDate) {
		this.ratedDate = ratedDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pk == null) ? 0 : pk.hashCode());
		result = prime * result + ((ratedDate == null) ? 0 : ratedDate.hashCode());
		result = prime * result + score;
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
		if (ratedDate == null) {
			if (other.ratedDate != null)
				return false;
		} else if (!ratedDate.equals(other.ratedDate))
			return false;
		if (score != other.score)
			return false;
		return true;
	}

}
