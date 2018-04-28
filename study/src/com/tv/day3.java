package com.tv;


//封装的概念就是把不想或者不该告诉别人的东西隐藏起来，把可以告诉别人的公开;
//做法：修改属性的访问权限来限制对属性的访问，并为每一个属性创建一对取值方法和赋值方法，用于对这些属性的访问
class st{
	private String name;
	private int age;
	private char gender;
	
	
	public void setGender(char gender){
		if( gender == '男'|| gender == '女'){
			this.gender=gender;}
	}
	
	public char getGendr(){
		return this.gender;
	}
}

public class day3 {
	public static void main(String[] agrs){
		st one=new st();
		one.setGender('女');
		System.out.print(one.getGendr());
	}
	
	

}
