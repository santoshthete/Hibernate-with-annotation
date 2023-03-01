package hibernatewithAnnotaion;

import org.hibernate.Session;

public class CreateOperation {
public static void main(String[] args) {
	Session session=HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	
	Employee e1=new Employee();
	 e1.setDept("engg");
	 e1.setName("ram");
     e1.setSalary(1000);
     
     Employee e2=new Employee();
     e2.setDept("Medical");
	 e2.setName("shyam");
     e2.setSalary(2000);
     
     Employee e3=new Employee();
	 e3.setDept("arts");
	 e3.setName("kunal");
     e3.setSalary(1000);
     
     Employee e4=new Employee();
     e4.setDept("science");
	 e4.setName("rohan");
     e4.setSalary(2000);
     
     session.save(e1);
     session.save(e2);
     session.save(e4);
     session.save(e3);
     session.getTransaction().commit();
     System.out.println("date inserted");
     
   //  SequenceStyleGenerator
}
}
