package com.example.project.service;

import java.util.List;

import com.example.project.entity.Beers;

public interface BeersService {

	
	public List<Beers> getBeers();
	
	public void saveBeer(Beers theBeer);

	public Beers getBeer(int theBeerId);

	public void deleteBeer(int theBeerId);
	
	
}
