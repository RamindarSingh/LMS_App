package EmployeePackage;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import LeavesPackage.Leaves;
import Utility.DatabaseHandler;

@Service
public class EmployeeServices {
	
	@Autowired
	private DatabaseHandler database;
	
	public boolean addEmployee(Employee employee){
		
		database.pushObjectInDB(Employee.class, employee);
		
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
