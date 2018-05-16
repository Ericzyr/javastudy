package com.tv;

import org.junit.Test;

import junit.framework.Assert;





class le{
public void verify(boolean b) {
	
    if (false) {
    	System.out.println(b);
        Assert.fail();
    	}
    else if(true){
    	System.out.println(b);
    	}
	}
}
public class falseAndtrue {
	
	@Test
	public void test() {
		
		
		le l=new le();
		l.verify(2==2);
		

	}
}

