package uyt;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;


import uyt.Gaandu.Raju;

public class App {
	public static void main(String[] args) {
		
		   Raju raju = new Raju();
		   
		raju.setNum(114);
		raju.setName("kamal");

		Configuration conf = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Raju.class);
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        SessionFactory sfg = conf.buildSessionFactory(registry);

		Session session = sfg.openSession();
		session.beginTransaction();
		
		session.save(raju);
		raju.setName("komu14");
	
				
				
				session.getTransaction().commit();
		
		session.close();

		
		 

	}
}
