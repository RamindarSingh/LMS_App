package Utility;

import java.util.List;

import javax.validation.ConstraintViolationException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DatabaseHandler {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	public Session getDbSession(Class<?> className) throws HibernateException {
		Session session = null;
		try {
			Configuration con = new Configuration().configure().addAnnotatedClass(className);

			SessionFactory sf = con.buildSessionFactory();

			session = sf.openSession();

		} catch (HibernateException e) {
			log.error(e.getMessage());
		}
		return session;
	}

	public boolean pushObjectInDB(Class<?> className, Object obj) {

		Session session = getDbSession(className);

		try {
			Transaction tx = session.beginTransaction();

			session.save(obj);

			tx.commit();
		} catch (ConstraintViolationException e) {
			log.error(e.getMessage());
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return true;
	}

	public boolean deleteObjectInDB(Class<?> className, Object obj) {

		
		Session session = getDbSession(className);

		session.delete(obj);

		return true;
	}

	public Object getObjectbyId(Class<?> className, String id) {

		Session session = getDbSession(className);

		return session.get(className, id);
	}
	
	public List<Object> selectAll(Class<?> className){
		
		//className.getSimpleName()
		return null;
	}
}
