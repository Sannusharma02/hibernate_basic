package com.oehm3.basics.utils;

import java.util.Date;

import com.oehm3.basics.dao.EmployeeDAO;
import com.oehm3.basics.dto.Employee;

public class Test {
	public static void main(String[] args) {
		
			Employee employee = new Employee();
			employee.setId(105);
			employee.setName("Raju");
			employee.setContactNumber(102);
			employee.setEmployeeNumber("RBI215");
			employee.setSalary(2500.00);
			employee.setJoiningDate(new Date());
			
			EmployeeDAO employeeDAO = new EmployeeDAO();
			employeeDAO.saveEmployee(employee);
			System.out.println("data saved successfully");
	}
}

