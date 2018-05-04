package com.tv;
import  com.tv.class1;
public class class2 {
	public static void main(String[] args) {
		class1 input = new class1();
		System.out.print(input.age);
		
		input.eat();
	
		input.sleep("room"+"\n");//无参数有返回的 
		
		int age  = input.getAge(18);
		System.out.print("\n"+"有参数有返回的类型："+age);
		
/*	权限								没写
 *         public   protected     default    private
 * 同一个类  OK          OK          OK         OK
 * 同一个包	OK			OK			OK
 * 子类		OK			OK
 * 不同包中  OK
 * 
 * 类只能被public 和default 访问权限修饰符修饰
 * 当一个记事本中定义了多个类，只能出出一个public的类
 * 
 * 类中的成员可以被以上四种访问权限修饰符修饰
 * 
 * 
 * 
 * */		
	
		
	}
}
