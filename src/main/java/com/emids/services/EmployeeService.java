package com.emids.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emids.dao.EmployeeDAO;
import com.emids.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO employeeDao;
	@Transactional
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployees();
	}
	@Transactional
	public Employee getEmployee(int id) {
		return employeeDao.getEmployee(id);
	}
	
	@Transactional
	public void addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);
	}
	

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.updateEmployee(employee);
	}

	@Transactional
	public void deleteEmployee(int id) {
		employeeDao.deleteEmployee(id);

}
}
