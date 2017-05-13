package EmployeePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	
	@RequestMapping("/")
	public String homePage(){
		return "login";
	}
	
	@RequestMapping("/add")
	public String addEmployee(){
		return "addEmployee";
	}
	
	@RequestMapping(value="/submitted", method=RequestMethod.POST)
	public String submitted(@ModelAttribute("employee") Employee employee, Model model){
		
		if (employeeServices.addEmployee(employee))
		{
			System.out.println("Congrats ! added");
			model.addAttribute("employee", employee);
			return "addLeaves";
		} 
		else
			System.out.println("Unable to add");
			return "homePage";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(){
		return "deleteEmployee";
	}
	
	@RequestMapping(value = "/deleting", method=RequestMethod.POST)
	public String deletedEmployee(@RequestParam("empId") String empId, Model model){
		
		Employee employee = employeeServices.deleteEmployee(empId);
		
		model.addAttribute("employee", employee);
		
		return "deleted";
		
	}
	@RequestMapping("/update")
	public String updateEmployee(){
		return "updateEmployee";
	}
}
