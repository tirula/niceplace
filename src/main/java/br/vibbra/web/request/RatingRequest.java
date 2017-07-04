package br.vibbra.web.request;

import java.io.Serializable;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
public class RatingRequest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4565021525370041994L;

	private Long placeID;

	private String foods;

	private String drinks;

	private float waiter;

	private float bill;

	private float confortable;

	private float noisy;

	private float total;

	public RatingRequest() {
	}

	public Long getPlaceID() {
		return placeID;
	}

	public void setPlaceID(Long placeID) {
		this.placeID = placeID;
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

}
