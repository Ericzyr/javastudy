package com.tv;

public class class1 {
	String name;  //这是类的属性
	int age =18 ;
	String jop;
	/*无参数无返回的类型方法*/
	public void eat(){    // 这是类的方法，
		System.out.println("正在上班");
	}
	/*有参数无返回的类型*/
	public void sleep(String A){
		System.out.print("我在"+ A +"sleep");	
	}
	/*有参有返回的*/
	public int getAge(int a){
		return a;
	}
	
	public static void main(String[] args) {  //主函数
	}

}