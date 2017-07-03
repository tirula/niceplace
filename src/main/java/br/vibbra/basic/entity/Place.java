package br.vibbra.basic.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * 
 * @author Brunno de Almeida Santos
 *
 * 
 */
@Table
@Entity(name = "PLACE")
public class Place implements Serializable {

	/**
	 * 
	 */
	@Transient
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PLACE_ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

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

}
