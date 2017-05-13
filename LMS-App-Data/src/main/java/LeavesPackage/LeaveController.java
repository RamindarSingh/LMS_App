package LeavesPackage;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import EmployeePackage.Employee;

@Controller
public class LeaveController {

	@Autowired
	private LeaveServices leaveServices;
	
	private Employee employee;

	@RequestMapping(value = "/loginCheck", method = RequestMethod.POST)
	public String loginCheck(Model model, @RequestParam Map<String, String> pathVars) {
		String empId = pathVars.get("empId");
		// String empPassword = pathVars.get("empPassword");
		employee = leaveServices.getEmployeeDetails(empId);

		if (employee == null)
			return "login";

		model.addAttribute("employee", employee);
		return "leaveStatus";
	}

	@RequestMapping("/leaveSubmitted")
	public String leaveSubmitted(@RequestParam Map<String, String> pathVars) {

		LeavesStatus ls = new LeavesStatus();

		ls.setEmpId(employee.getEmpId());
		ls.setSupervisor(employee.getSupervisor());
		ls.setStartDate(pathVars.get("startDate"));
		ls.setEndDate(pathVars.get("endDate"));
		ls.setReason(pathVars.get("reason"));

		leaveServices.addLeave(ls);
		return "leaveStatus";
	}

	@RequestMapping(value = "/submitLeaves", method = RequestMethod.POST)
	public String submitLeaves(@ModelAttribute("leave") Leaves leave) {

		if (leaveServices.addLeave(leave)) {
			System.out.println("Congrats ! added");
			return "homePage";
		} else
			System.out.println("Unable to add");
		return "homePage";
	}
}
