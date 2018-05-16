package com.tv;

class gou{
	String name="java";
	int age=25;
	

//	@Override
	public String toString(String name,int age){
		this.name=name;
		this.age=age;
		return "r";
	}
	
}
public class number_tostring{
	public static void main(String[] args) {
		
		String s=new String("java");
		 gou g=new gou();
		
		 System.out.println(g);
		 System.out.println(s.toString());

	}

}
