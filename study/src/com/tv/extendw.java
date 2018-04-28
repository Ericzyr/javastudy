package com.tv;


/*类的继承*/

class Person1{
	String name;
	int age;
	char gender;	
	public void person(){
		System.out.println("都是在学习文化");
	}
}

/*学生t继承了人的特性*/
class Studentt extends Person1 {
	Studentt (String name){//这个是有参的构造方法，和类同名
		this.name=name;
	}
	
	public void study(String name){  //这个是有参数的方法无返回
		System.out.println(name+"学习");
	}
}


/*学生t继承了人的特性*/
class Teacher extends Person1{
	public void teacher(){
		System.out.println("教书");
	}
}



public class extendw {
	public static void main(String[] args) {
		Studentt st= new Studentt("tom");
		st.study(st.name);
		System.out.print(st.name);
	}
}
