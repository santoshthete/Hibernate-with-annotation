package com.hibernate;

import javax.security.auth.login.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Test {
public static void main(String[] args) {
	System.out.println("Step 1");
	org.hibernate.cfg.Configuration cfg=new org.hibernate.cfg.Configuration();
	System.out.println("Step 2");
	cfg=cfg.configure("hibernate.cfg.xml");
	System.out.println("Step 3");
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println("Step 4");
	Session session=sessionFactory.openSession();
	Student s1=new Student();
	s1.setName("shyam");
	s1.setMarks(90);
	
	System.out.println("Step 5");
	Transaction transaction =session.beginTransaction();
	System.out.println("Step 6");
	session.save(s1);
	
	System.out.println("Record saved successfully");
	
	
}
}