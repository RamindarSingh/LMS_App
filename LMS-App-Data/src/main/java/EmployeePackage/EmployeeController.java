package EmployeePackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;
	
	
	@RequestMapping("/")
	public String homePage(){
		return "homePage";
	}
	@RequestMapping("/add")
	public String addEmployee(){
		return "addEmployee";
	}
	
	@RequestMapping(value="/submitted", method=RequestMethod.POST)
	public String submitted(@ModelAttribute("employee") Employee employee){
		
		if (employeeServices.addEmployee(employee)){
			System.out.println("Congrats ! added");
		} else
			System.out.println("Unable to add");
		
		return "homePage";
	}
	
	@RequestMapping("/delete")
	public String deleteEmployee(){
		return "deleteEmployee";
	}
	@RequestMapping("/update")
	public String updateEmployee(){
		return "updateEmployee";
	}
}
