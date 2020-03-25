package com.prft.service;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.prft.OneToOneMapping.Passenger;
import com.prft.OneToOneMapping.Train;

public class OneToOne{
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_Programs");
		EntityManager em=emf.createEntityManager();
		em.getTransaction().begin();
		Passenger p=new Passenger();
		p.setTicket_no(1234);
		p.setPassenger_name("Balaji");
	
		Passenger p1=new Passenger();
		p1.setTicket_no(345);
		p1.setPassenger_name("anandhi");
		em.persist(p);
		em.persist(p1);
		
		Train t=new Train();
		t.setTrain_id(00001);
		t.setTrain_name("Anandhapuri");
		t.setPass(p);
		
		Train t1=new Train();
		t1.setTrain_id(00003);
		t1.setTrain_name("vaigai");
		t1.setPass(p1);
		
		em.persist(t);
		em.persist(t1);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
		
	}
}