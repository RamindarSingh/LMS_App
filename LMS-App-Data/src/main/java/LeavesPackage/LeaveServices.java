package LeavesPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Utility.DatabaseHandler;

@Service
public class LeaveServices {
	
	@Autowired
	private DatabaseHandler database;

	public boolean add(Leaves leaves){
		
		database.pushObjectInDB(Leaves.class, leaves);
		
		return true;
	}
}
