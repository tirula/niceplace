package br.vibbra.basic.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

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
	private static final long serialVersionUID = -153890430669529805L;

	@ManyToOne
	private User user;

	@ManyToOne
	private Place place;

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
		result = prime * result + Float.floatToIntBits(bill);
		result = prime * result + Float.floatToIntBits(confortable);
		result = prime * result + ((createdDate == null) ? 0 : createdDate.hashCode());
		result = prime * result + ((drinks == null) ? 0 : drinks.hashCode());
		result = prime * result + ((foods == null) ? 0 : foods.hashCode());
		result = prime * result + ((internet == null) ? 0 : internet.hashCode());
		result = prime * result + Float.floatToIntBits(noisy);
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		result = prime * result + Float.floatToIntBits(total);
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		result = prime * result + Float.floatToIntBits(waiter);
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
		if (Float.floatToIntBits(bill) != Float.floatToIntBits(other.bill))
			return false;
		if (Float.floatToIntBits(confortable) != Float.floatToIntBits(other.confortable))
			return false;
		if (createdDate == null) {
			if (other.createdDate != null)
				return false;
		} else if (!createdDate.equals(other.createdDate))
			return false;
		if (drinks == null) {
			if (other.drinks != null)
				return false;
		} else if (!drinks.equals(other.drinks))
			return false;
		if (foods == null) {
			if (other.foods != null)
				return false;
		} else if (!foods.equals(other.foods))
			return false;
		if (internet == null) {
			if (other.internet != null)
				return false;
		} else if (!internet.equals(other.internet))
			return false;
		if (Float.floatToIntBits(noisy) != Float.floatToIntBits(other.noisy))
			return false;
		if (place == null) {
			if (other.place != null)
				return false;
		} else if (!place.equals(other.place))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		if (Float.floatToIntBits(waiter) != Float.floatToIntBits(other.waiter))
			return false;
		return true;
	}

}
