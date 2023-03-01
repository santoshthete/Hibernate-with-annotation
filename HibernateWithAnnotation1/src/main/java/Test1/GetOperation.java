package Test1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetOperation {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
session.beginTransaction();
Employee e1=session.get(Employee.class, 7);
e1.setDept("anthropoloy");
System.out.println("record updates"+e1);

session.getTransaction().commit();
session.close();
factory.close();
	}

}
