package com.mustafaergan.sirket.run;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mustafaergan.sirket.entity.Skor;

public class Islem {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Skor");
		
		EntityManager em = emf.createEntityManager();
		
		
		Skor skor = new Skor();
		
		skor.setId(1);
		skor.setName("mehmet");
		em.getTransaction().begin();
		em.persist(skor);
		em.getTransaction().commit();
		
		
	}

}
