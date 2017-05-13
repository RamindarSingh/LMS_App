package LeavesPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EmployeePackage.Employee;
import Utility.DatabaseHandler;

@Service
public class LeaveServices {

	@Autowired
	private DatabaseHandler database;

	public boolean addLeave(Object object){
		
		database.pushObjectInDB(object.getClass(), object);	
		return true;
	}
	public Employee getEmployeeDetails(String empId) {

		
		Employee employee = (Employee) database.getObjectbyId(Employee.class, empId);
		return employee;
	}
}
