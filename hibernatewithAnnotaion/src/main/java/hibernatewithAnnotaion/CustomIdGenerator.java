package hibernatewithAnnotaion;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Random;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomIdGenerator implements IdentifierGenerator{
 
	public int randomNo() {
		Random r=new Random();
		
		return r.nextInt(100);
		
	}
	
	public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
	// TODO Auto-generated method stub
	 
	 Calendar cal=Calendar.getInstance();
	 
	
	return "emp"+ randomNo()+cal.get(Calendar.YEAR);
}
}
