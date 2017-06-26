package entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

/**
 * Created by tirula66 on 6/26/17.
 */
@Entity
@Table(name = "place", catalog = "vibbra", uniqueConstraints = {
        @UniqueConstraint(columnNames = "name") })
public class Place implements Serializable {

    /**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 3435364968518267358L;

	private int id;

    private String name;

    private String address;

    private String city;

    private String state;

    private String country;

    public Place() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
