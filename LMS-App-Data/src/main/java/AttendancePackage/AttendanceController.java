package AttendancePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AttendanceController {

	@Autowired
	private SensorData sensorData;
	@RequestMapping(value="/SensorData", method=RequestMethod.POST)
	public String pushSensorData(@ModelAttribute("sensorData") SensorData sensorData){
		
		return null;
	}
	
	
	
}
