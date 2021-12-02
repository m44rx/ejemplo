package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCustomer;
	private String nameCustomer;
	
	
	@ManyToMany(mappedBy = "customers", cascade = {CascadeType.MERGE,CascadeType.PERSIST,CascadeType.DETACH})
	List<Employee> employees = new ArrayList<>();


	
	
	
	
	
	//******************************************
	public Integer getIdCustomer() {
		return idCustomer;
	}


	public void setIdCustomer(Integer idCustomer) {
		this.idCustomer = idCustomer;
	}


	public String getNameCustomer() {
		return nameCustomer;
	}


	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}


	public List<Employee> getEmployees() {
		return employees;
	}


	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
