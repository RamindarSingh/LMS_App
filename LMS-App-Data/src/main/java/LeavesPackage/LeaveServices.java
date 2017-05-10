package LeavesPackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

import EmployeePackage.Employee;

@Service
public class LeaveServices {
	
	public boolean add(Leaves leaves){
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(leaves);
		
		tx.commit();
		return true;
	}
}
