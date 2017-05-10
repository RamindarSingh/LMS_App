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
	
	public Employee deleteEmployee(String empId){

		Employee employee = (Employee)database.getObjectbyId(Employee.class, empId);
		
		database.deleteObjectInDB(Employee.class, employee);
		
		return employee;
	}
	
	public ArrayList<Employee> getAllEmployees(){
		
		//Do database 
		return null;
	}
	
	
}
