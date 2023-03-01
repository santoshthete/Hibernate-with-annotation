package Test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
Configuration cfg=new Configuration();
cfg=cfg.configure("hibernate.cfg.xml");
SessionFactory factory=cfg.buildSessionFactory();
Session session=factory.openSession();
Transaction transaction=session.beginTransaction();


Employee e1=session.get(Employee.class, 1);
session.delete(e1);
System.out.println("record deleted");

//Query q=session.createQuery("from Employee");
//List<Employee> list=q.getResultList();
//for(Employee e:list) {
//	System.out.println(e);
//}

//Employee e1 =session.get(Employee.class, 1);
//e1.setDept("Admin");
//e1.setName("viaraj");
//session.update(e1);



//System.out.println(e1);
//Employee emp=new Employee();
//emp.setName("Santosh");
//emp.setDept("physics");
//emp.setSalary(110000);





transaction.commit();
session.close();
factory.close();
System.out.println("recored  inserted successfully");

	
	}
}
