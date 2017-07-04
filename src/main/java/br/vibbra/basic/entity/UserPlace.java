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
import javax.persistence.Column;
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

	@Column(name = "created_date", nullable = false, length = 10)
	private Date createdDate;

	@Column(name = "foods")
	private String foods;

	@Column(name = "drinks")
	private String drinks;

	@Column(name = "waiter")
	private float waiter;

	@Column(name = "bill")
	private float bill;

	@Column(name = "confortable")
	private float confortable;

	@Column(name = "noisy")
	private float noisy;

	@Column(name = "total")
	private float total;

	@Column(name = "internet")
	private String internet;

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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getFoods() {
		return foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getDrinks() {
		return drinks;
	}

	public void setDrinks(String drinks) {
		this.drinks = drinks;
	}

	public float getWaiter() {
		return waiter;
	}

	public void setWaiter(float waiter) {
		this.waiter = waiter;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public float getConfortable() {
		return confortable;
	}

	public void setConfortable(float confortable) {
		this.confortable = confortable;
	}

	public float getNoisy() {
		return noisy;
	}

	public void setNoisy(float noisy) {
		this.noisy = noisy;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getInternet() {
		return internet;
	}

	public void setInternet(String internet) {
		this.internet = internet;
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
