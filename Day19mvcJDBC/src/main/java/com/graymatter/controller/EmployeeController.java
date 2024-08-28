package com.graymatter.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;
import com.graymatter.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	
//	@RequestMapping("/employee")
//	public String getAllEmployees(){
//		
//		List<Employee>empList = service.getAllEmployee();
//		for(Employee e : empList)
//			System.out.println(e);
//		
//		return "employee";
//		
//	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Model model) {
        
        if ("admin".equals(username) && "admin".equals(password)) {
           
            return "redirect:/employee";
        } else {
           
            
            return "login";
        }
    }

	
	
	@RequestMapping("/employee")
	public String getAllEmployees(Model model) {
	    List<Employee> empList = service.getAllEmployee();
	    for (Employee e : empList) {
	        System.out.println(e);
	    }
	    model.addAttribute("empList", empList);
	    return "employee";
	}
	
	@RequestMapping(value = "/employee/add",method = RequestMethod.GET)
	public String addEmployeeForm(Model model) {
		model.addAttribute("employee",new Employee());
		return "addEmployee";	
	}
	
	@RequestMapping(value = "/employee/add",method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee") Employee employee) {
		service.addEmployee(employee);
		return "redirect:/employee";	
	}
	
	@RequestMapping(value = "/employee/update/{id}", method = RequestMethod.GET)
    public String showUpdateEmployeeForm(@PathVariable("id") int empId, Model model) throws SQLException {
        Employee employee = service.getEmployeeById(empId);
        model.addAttribute("employee", employee);
        return "updateEmployee";
    }

    @RequestMapping(value = "/employee/update", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute("employee") Employee employee) {
        service.updateEmployee(employee);
        return "redirect:/employee";
        
        
    }
  	
	
    @RequestMapping(value = "/employee/delete/", method = RequestMethod.GET)
    public String deleteEmployee(@ModelAttribute("employee") Employee employee) {
        service.deleteEmployee(employee);
        return "redirect:/employee";
    }
    
    
    
    
}
	
	
	
	
	
	
	
	

