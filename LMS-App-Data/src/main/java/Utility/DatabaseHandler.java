package Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class DatabaseHandler {
	
	public Session getDbSession(Class<?> className){
		
		Configuration con = new Configuration().configure().addAnnotatedClass(className);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		return session;
	}
	
	public boolean pushObjectInDB(Class<?> className, Object obj){
		
		Session session = getDbSession(className);
		
		Transaction tx = session.beginTransaction();
		
		session.save(obj);
		
		tx.commit();
		
		return true;		
	}
}
