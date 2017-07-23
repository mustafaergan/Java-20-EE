package com.mustafaergan.skor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class ADao {

	protected EntityManager em;
	
	public ADao() {
		EntityManagerFactory emf =
		Persistence.createEntityManagerFactory("Skor");
		this.em = emf.createEntityManager();
	}
	
	
}
