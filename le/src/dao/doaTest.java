package dao;

import org.junit.Test;


public class doaTest {
	
	@Test
	public void addt(){
		
		user us=new user("java",25);
		
		user_interface dao= new user_implement();
		
		dao.add(us);
		dao.getUser(us);
		
		
	
	}

}
