package com.hibernate;

public class Student {
private int id;
private String name;
private int marks;

public Student() {
	super();
	// TODO Auto-generated constructor stub
} 

	


public Student(String name, int marks) {
	super();
	this.name = name;
	this.marks = marks;
	// TODO Auto-generated constructor stub
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
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}



}
