package dao;

import java.util.*;

import java.util.HashMap;

//public final static letvcase t=new letvcase();
//public static final Map<String,String> p = t.initMapApps();


class letvcase{
	
	
	
/*这个类型必需要有一个返回值String*/
	HashMap<String ,String> initMapApps(){
		
		HashMap<String,String> map = new HashMap<String,String>();
	    map.put("tom1","letv.com1");
	   
	    return map;
	}
	
	public String test(){
		return "he";
	}
	

}

public class t {
	public static void main(String[] args) {
		
		letvcase t=new letvcase();
		
		Map<String,String> p = t.initMapApps();
		
		    p.put("tom2","letv.com2");
		    p.put("tom3","letv.com3");
		    
		
		   
		    
		if(p.containsKey("tm")){  /*在hashmap中判断有健值有没有*/
			System.out.println("ture");
		
		}else{
			System.out.println("sorry no fail");
		}
		
		
		 System.out.println(p.get("tom2"));/*在hashmap中获取健值对应的值*/
		
		System.out.println(p);/*在hashmap返回的值*/
		
		String a=t.test();
		System.out.println(a);
		
		
	}
}
