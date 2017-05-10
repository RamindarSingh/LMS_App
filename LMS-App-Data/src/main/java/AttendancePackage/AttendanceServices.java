package AttendancePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Utility.DatabaseHandler;

@Service
public class AttendanceServices {

	@Autowired
	private DatabaseHandler database;
	public void pushSensorData(SensorData SensorData) {
		
		database.pushObjectInDB(SensorData.class, SensorData);
		
	}
	
	
	
}
