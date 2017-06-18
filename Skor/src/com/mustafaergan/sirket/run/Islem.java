package com.mustafaergan.sirket.run;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mustafaergan.sirket.entity.Personel;
import com.mustafaergan.sirket.entity.Skor;

public class Islem {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("Skor");
		
		EntityManager em = emf.createEntityManager();
		
		//insert
		
		Skor skor = new Skor();
		
//		skor.setId(1);
		skor.setName("mehmet");
		em.getTransaction().begin();
		em.persist(skor);
		em.getTransaction().commit();
		
		
		Skor skor2 = new Skor();
//		skor2.setId(2);
		skor2.setName("ali");
		em.getTransaction().begin();
		em.persist(skor2);
		em.getTransaction().commit();
		
		Personel personel = new Personel();
//		personel.setPersonelId(1);
		personel.setName("Hasan");
		
		em.getTransaction().begin();
		em.persist(personel);
		em.getTransaction().commit();
		
		//get iþlemeleri
		System.out.println("---------------");

		Personel personel4 = em.find(Personel.class, 39);
		Skor skor4 = em.find(Skor.class, 1);
		System.out.println(personel4.getName());
		System.out.println(skor4.getName());
		//UPDATE
		
		Personel personel33 = em.find(Personel.class, 39);
		personel33.setName("LALE");
		em.getTransaction().begin();
		em.merge(personel33);
		em.getTransaction().commit();
		
		//DELETE
		
//		Skor skor22 = em.find(Skor.class, 2);
//
//		em.getTransaction().begin();
//		em.remove(skor22);
//		em.getTransaction().commit();
		
		System.out.println("------------Skor Listesi-----------");

		List<Skor> skorList = (List<Skor>)
		em.createQuery("SELECT s FROM Skor s").getResultList();
		
		
		for (Skor skor3 : skorList) {
			System.out.println(skor3.getName());
		}
		
		
		System.out.println("------------Skor Listesi-----------");

		Skor skorList2 = (Skor)
		em.createQuery("SELECT s FROM Skor s WHERE s.id = :xxx")
		.setParameter("xxx", 1)
		.getSingleResult();
		
		
		System.out.println(skorList2.getName());
		
		
	}

}
