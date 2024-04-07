package com.oehm3.basics.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="employee")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Employee implements Serializable {

	@Id
	@Column(name ="id")
	private int id;
	@Column(name ="employee_number")
	private String employeeNumber;
	@Column(name ="name")
	private String name;
	@Column(name ="joining_date")
	private Date joiningDate;
	@Column(name ="contact_number")
	private int contactNumber;
	@Column(name ="salary")
	private Double salary;
	
	public Employee() {
		
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeNumber=" + employeeNumber + ", name=" + name + ", joiningDate="
				+ joiningDate + ", contactNumber=" + contactNumber + ", salary=" + salary + "]";
	}
	
}
