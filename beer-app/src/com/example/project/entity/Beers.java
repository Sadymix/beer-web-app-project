package com.example.project.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "beers")
public class Beers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "beer_name")
	private String beerName;
	
	@Column(name = "brewery_name")
	private String breweryName;
	
	@Column(name = "beer_style")
	private String beerStyle;

	
	public Beers() {
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBeerName() {
		return beerName;
	}

	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	public String getBreweryName() {
		return breweryName;
	}

	public void setBreweryName(String breweryName) {
		this.breweryName = breweryName;
	}

	public String getBeerStyle() {
		return beerStyle;
	}

	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}

	@Override
	public String toString() {
		return "Beers [id=" + id + ", beerName=" + beerName + ", breweryName=" + breweryName + ", beerStyle="
				+ beerStyle + "]";
	}
	
	
	
	
}
