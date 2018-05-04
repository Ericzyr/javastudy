package com.tv;
/*接口中成员的格式：
 * 1. public static final String NAME="小李";//全局常量
 * 2. public abstract void show();// 抽象方法
 * 
 * 注意：
 * 1、接口中只能出现public（公共的） 访问修饰符，不可以出现 private（私有的）
 * 2、接口不可以创建对象，因为 里面有抽象方法，需要 被子类实现，子类对接口中的所有抽象 方法实现
 * 
 * 
 * 类是是定义是多个类中共性基本功能 ； 是必须的
 * 接口是定义的是扩展功能 ；  是扩展性，可以有也可以没有这个功能 ；
 * 接口好处：可以多实现，也就是一个可以实现多个接口
 * 
 */
/* 接口1*/
interface Apple{
	public static final String NAME="小李";//全局常量
						int i=0;
	public abstract void show();
}
/* 接口2*/
interface banana{
	public abstract void eat();// 接口中没方法 ｛｝
}

/*类*/
class Persontt{
	public String name="ja";
	int age;
}



/* 类 可以多个方法实现但接口不可以继承 ，只有类可以继承*/
class student2 extends Persontt implements Apple,banana{
		public void show(){
			System.out.println(name+"在吃苹果");
		}
		public void eat(){
			System.out.print("在吃香蕉");
		}
	
}
public class day_interface {
		public static void main(String[] args){
			student2 see=new student2();
			see.show();
			see.eat();
		}  
}