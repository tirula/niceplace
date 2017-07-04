package br.vibbra.basic.entity;
/**
 * 
 * @author Brunno de Almeida Santos

 *
 */

import java.beans.Transient;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "user_place")
@AssociationOverrides({ @AssociationOverride(name = "pk.user", joinColumns = @JoinColumn(name = "username")), @AssociationOverride(name = "pk.place", joinColumns = @JoinColumn(name = "place_id")) })
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

	@Transient
	public Date getCreatedDate() {
		return pk.getCreatedDate();
	}

	public void setCreatedDate(Date createdDate) {
		this.pk.setCreatedDate(createdDate);
	}

	@Transient
	public String getFoods() {
		return pk.getFoods();
	}

	public void setFoods(String foods) {
		this.pk.setFoods(foods);
	}

	@Transient
	public String getDrinks() {
		return pk.getDrinks();
	}

	public void setDrinks(String drinks) {
		this.pk.setDrinks(drinks);
	}

	@Transient
	public float getWaiter() {
		return pk.getWaiter();
	}

	public void setWaiter(float waiter) {
		this.pk.setWaiter(waiter);
	}

	@Transient
	public float getBill() {
		return pk.getBill();
	}

	public void setBill(float bill) {
		this.pk.setBill(bill);
	}

	@Transient
	public float getConfortable() {
		return pk.getConfortable();
	}

	public void setConfortable(float confortable) {
		this.pk.setConfortable(confortable);
	}

	@Transient
	public float getNoisy() {
		return pk.getNoisy();
	}

	public void setNoisy(float noisy) {
		this.pk.setNoisy(noisy);
	}

	@Transient
	public float getTotal() {
		return pk.getTotal();
	}

	public void setTotal(float total) {
		this.pk.setTotal(total);
	}

	@Transient
	public String getInternet() {
		return pk.getInternet();
	}

	public void setInternet(String internet) {
		this.pk.setInternet(internet);
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
