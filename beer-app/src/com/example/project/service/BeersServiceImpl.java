package com.example.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.dao.BeersDAO;
import com.example.project.entity.Beers;

@Service
public class BeersServiceImpl implements BeersService{

	@Autowired
	private BeersDAO beersDAO;
	
	
	@Override
	@Transactional
	public List<Beers> getBeers() {
		
		return beersDAO.getBeers();
	}

	@Override
	@Transactional
	public void saveBeer(Beers theBeer) {
		beersDAO.saveBeer(theBeer);
		
	}

	@Override
	@Transactional
	public Beers getBeer(int theBeerId) {
		
		return beersDAO.getBeer(theBeerId);
	}

	@Override
	@Transactional
	public void deleteBeer(int theBeerId) {
		beersDAO.deleteBeer(theBeerId);
		
	}

}
