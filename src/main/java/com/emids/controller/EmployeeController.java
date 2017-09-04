package com.emids.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.emids.model.Employee;
import com.emids.services.EmployeeService;

@Controller
public class EmployeeController {
	
@Autowired
EmployeeService service;
@RequestMapping(value="/getAllEmployees", method= RequestMethod.GET,headers="Accept=application/json")
public String getEmployees(Model model){
	List<Employee> listOfEmployee = service.getAllEmployee();
	model.addAttribute("Employee", new Employee(0, null, null, 0));
	model.addAttribute("listOfEmployee",listOfEmployee);
	return "EmployeeDetails";
}
@RequestMapping(value="/getEmployee/{id}", method= RequestMethod.GET,headers="Accept=application/json")
public Employee  getEmployeebyId(@PathVariable int id){
	return service.getEmployee(id);
}
@RequestMapping(value="/addEmployee", method= RequestMethod.GET,headers="Accept=application/json")
public String  addEmployee(@ModelAttribute("employee") Employee employee){
	if(employee.getId()==0){
		service.addEmployee(employee);
	}
	else {
		service.updateEmployee(employee);
	}
	return "redirect:/getAllEmployees";
}
@RequestMapping(value="/updateEmployee/{id}", method= RequestMethod.GET,headers="Accept=application/json")
public String  updateEmployeebyId(@PathVariable int id,Model model){
	model.addAttribute("Employee", this.service.getEmployee(id));
	model.addAttribute("listOfEmployee",this.service.getAllEmployee());
	return "EmployeeDetails";
}
@RequestMapping(value="/deleteEmployee/{id}", method= RequestMethod.GET,headers="Accept=application/json")
public String  deleteEmployeebyId(@PathVariable int id){
	service.deleteEmployee(id);
	return  "redirect:/getAllEmployees";
}
}
