package com.tv;
public class class3 {
	String name=null;
	int age;
	/*无参无返回值*/
	public void eat(){
		System.out.print("hello wold");
	}
	/*有参无返回值*/
	public void tosleep(String agrs){
		System.out.println("hello to go"+agrs);
	}
	
	/*有参有返回值*/
	public int getAge(int agre){
		return agre;
	}
	
	public void tosleep(int time){
		if(time<0)return;
		for(int i =0;i<time;i++){
			System.out.println(time);
		}
	}

}
