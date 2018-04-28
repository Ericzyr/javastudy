package com.tv;

/*封装的概念的理解*/
class student1{
		String name;
		int age;
		private String gender;
	public void setGender(String gender){
		if(gender =="男"||gender =="女"){
			this.gender = gender;
			}
		else{
			System.out.println("你输入的有误");
		}	
	}
	public String getGender(){
		return this.gender;	
	}
}
public class test11 {
	public static void main(String[] args){
		student1 one =new student1();
		one.setGender("男");
		System.out.println(one.getGender());
	}
}
