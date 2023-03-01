package hibernatewithAnnotaion;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="emp")
public class Employee {
@Id



/*
@GenericGenerator(name="sequence-generator",
strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
parameters = {
		@Parameter(name="sequence_name",value="user_sequence"),
		@Parameter(name="initial_value",value="101")
}
		
		)
@GeneratedValue(generator = "sequence-generator")


*/
//emp546_2022
@GenericGenerator(name="custom_emp_id",strategy = "hibernatewithAnnotaion.CustomIdGenerator")
@GeneratedValue(generator = "custom_emp_id")

private String id;
private String name;
private String dept;
private int salary;
public Employee() {
	// TODO Auto-generated constructor stub
}


public void setId(String id) {
	this.id = id;
}


//public int getId() {
//	return id;
//}
//public void setId(int id) {
//	this.id = id;
//}
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
