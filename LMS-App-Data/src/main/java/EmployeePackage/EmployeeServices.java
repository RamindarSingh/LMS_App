package EmployeePackage;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {
	
	
	public boolean addEmployee(Employee employee){
		
		Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(employee);
		
		tx.commit();
		return true;
	}
	
	public boolean updateEmployee(String empId){
		
		//Do database 
		return true;
	}
	
	public boolean deleteEmployee(String emplId){
		
		//Do database 
		return true;
	}
	
	public ArrayList<Employee> getAllEmployees(){
		
		//Do database 
		return null;
	}
	
	
}
