package dao;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * ArrayList 和Vector 的区别与和的区别相同，它们是：
 * 
 * 1、 ArrayList 和 HashMap  都是线程异步的所以它们的特点是效率高但是安全性低。
 * 
 * 2、  Vector  和 Hashtable 都是线程同步的，所以它们的特点是效率低但是安全性高。
 *
 * /


/* arraylist 集合类 */

public class arraylist {

	public static void main(String[] args) {
		
		System.out.println("\t Arraylist 集合类 ");
		ArrayList<user> aa=new ArrayList<user>();/*<user>指的是泛指*/
		
		user s1=new user("jack1",25);
		user s2=new user("jack2",25);
		
		aa.add(s1);
		aa.add(s2);
		for	(int i=0;i<aa.size();i++){
//		user tv	=(user)aa.get(i);  /* 类型的强制转换*/
		user tv	=aa.get(i); /*如果泛指了就不需要强制转换了*/
		System.out.println(tv.getName());
		System.out.println(tv);
		}
	
		
		System.out.println("\t HashMap类 ");
//		HashMap
		HashMap<String, user> u=new HashMap<String,user>();/*<String, user>*/
		
		user tv1=new user("tom1",16);
		user tv2=new user("tom2",25);
		
		u.put("01",tv1);  /*001 是键值对*/
		u.put("02",tv2);
		
		if(u.containsKey("02")){
//			user tg	=(user)u.get("02");	  /* 类型的强制转换*/
			user tg	=u.get("02");	/*如果泛指了就不需要强制转换了*/
			System.out.println(tg.getName());
			System.out.println(tg.getId());
		}else{
			System.out.println("sorry no fail");
		}
		
		
	}
}
