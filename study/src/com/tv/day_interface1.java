package com.tv;

/*下面是写的接口*/
interface Smoke{
	public abstract void smoke();
}
interface Learn{
	public abstract void learn();
}


/*下面写的是继承的父函数*/

class Persont{
	String name;
	int age;
	char gender;
	void all(String name,int age,char gender){
		System.out.println("姓名:"+name+"\n"+"年龄:"+age+"\n"+"性别:"+gender);
	}
}


/*下面写是的继承的子函数和接口*/
class Student extends Persont implements Learn {
	public void learn(){
		System.out.println("正在学习"+"\n");
	}
}

class Worker extends Persont implements Smoke{
	public void smoke(){
		System.out.println("会吸烟"+"\n");
	}
}


/*下面写是主函数，程序是从主函数开始的*/
public class day_interface1 {
	public static void main(String[] args) {
		
		Student sd=new Student();
		sd.all("admin", 20, '男');
		sd.learn();
		
		Worker wk =new Worker(); 
		wk.all("jack", 22, '男');
		wk.smoke();
		
		
	}
}
