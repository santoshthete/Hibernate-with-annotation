package com.hibernate;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name="emp")
@Cacheable
@Cache(usage =CacheConcurrencyStrategy.READ_ONLY)
public class Employee {
@Id
@Column
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column (name="empname")
private String name;
@Column (name="Department")
private String dept;
@Column (name="salary")
private int salary;


public Employee() {
	//super();
	// TODO Auto-generated constructor stub
}
public Employee(int id, String name, String dept, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.dept = dept;
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
}

}
