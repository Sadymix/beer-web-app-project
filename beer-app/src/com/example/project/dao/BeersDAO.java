package com.example.project.dao;

import java.util.List;

import com.example.project.entity.Beers;

public interface BeersDAO {
	
	public List<Beers> getBeers();

	public void saveBeer(Beers theBeer);

	public Beers getBeer(int theBeerId);

	public void deleteBeer(int theBeerId);
}
