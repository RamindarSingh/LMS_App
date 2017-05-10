package LeavesPackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LeaveController {
	
	@Autowired
	private LeaveServices leaveServices;
	
}
