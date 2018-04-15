package it.deangelis.Traccialo;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.deangelis.model.Prodotto;






@SpringBootApplication
public class TraccialoApplication {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		
		Prodotto p1 = new Prodotto("aa", "aaaa", "cat", 2.0);
		session.save(p1);
	
		
 
		session.getTransaction().commit();
		session.close();
		
		SpringApplication.run(TraccialoApplication.class, args);
		

	}
}
