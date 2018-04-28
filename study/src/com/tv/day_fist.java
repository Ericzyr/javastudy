package com.tv;
import java.util.*;
class person{
	String name;
	int age;
	char gender;
	String job;
	public void setName(String name){
		System.out.print("第一次出现 "+name+"\n");
		this.name=name;

	}
	public String getName(){
		return this.name;
	}
}
public class day_fist {
	public static void main(String[] args) {
	person ps=new person();
	Scanner s=new Scanner(System.in);
	System.out.println("输入设置的名字");
	String hc = s.next();
	ps.setName(hc);
	String h =ps.getName();
	System.out.print(h);
	s.close();
	}
}