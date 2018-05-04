package com.tv;


/*多态
 * 1 条件 一定要有继承
 * 2 父类方法一定要重写
 * */

class person_day{
	private String name;
	private int age;
	public String setName(String name,int age){
		return this.name=name;
	}
	
	
	void working(){
		System.out.println("工作");
	}
}

class student_day extends person_day{
	void working(){
		System.out.println("学生的工作是学习");
	}
}
class work_day extends person_day{
	void working(){
		String name = setName("xim", 25);
		System.out.println(name+"工人的工作是干活");
	}
}

public class diversity {	
	public static void main(String[] args) {
		student_day s =new student_day();
		s.setName("jack", 25);
		funtion(s);
		work_day w =new work_day();
		funtion(w);
	}
	
	public static void funtion(person_day s){
		s.working();
	}

}
