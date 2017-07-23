package com.mustafaergan.skor.dao;

import java.util.List;

import com.mustafaergan.skor.entity.Assessment;
import com.mustafaergan.skor.entity.Person;

public class DAO extends ADao {

	public List<Person> getPErsonList() {
		return this.
		em.createQuery("SELECT c FROM Person c")
		.getResultList();

	}

	public void save(Assessment assAdd) {
		em.getTransaction().begin();
		em.persist(assAdd);
		em.getTransaction().commit();
		
	}

	public List<Assessment> getAssment() {
		return this.
		em.createQuery("SELECT c FROM Assessment c")
		.getResultList();
	}
	
}
