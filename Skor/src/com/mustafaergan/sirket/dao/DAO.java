package com.mustafaergan.sirket.dao;

import com.mustafaergan.sirket.entity.Adres;
import com.mustafaergan.sirket.entity.Personel;

public class DAO extends ADao {
	
	public void insert(Object obj){
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}
	
	public Adres getAdresId(int id){
		return em.find(Adres.class, id);
	}
	
	public Personel getAPersonelId(int id){
		return em.find(Personel.class, id);
	}

}
