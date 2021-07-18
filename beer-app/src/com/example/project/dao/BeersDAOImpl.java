package com.example.project.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.entity.Beers;

@Repository
public class BeersDAOImpl implements BeersDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	@Transactional
	public List<Beers> getBeers() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Beers> query = currentSession.createQuery("from Beers", Beers.class);
		
		List<Beers> beers = query.getResultList();
		
		return beers;
	}


	@Override
	public void saveBeer(Beers theBeer) {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		currentSession.saveOrUpdate(theBeer);
	}


	@Override
	public Beers getBeer(int theBeerId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Beers theBeer = currentSession.get(Beers.class, theBeerId);
		return theBeer;
	}

	@Override
	public void deleteBeer(int theBeerId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Beers> query = currentSession.createQuery("delete from Beers where id=:beerId");
		
		query.setParameter("beerId", theBeerId);
		
		query.executeUpdate();
	}
	
	

}
