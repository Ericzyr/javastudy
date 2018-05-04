package com.tv;

public class try4 {
	public static void main(String[] args){
		try{
			String str = "Eric的 ";
			System.out.print(str +"年龄是：");
			int age =Integer.parseInt("20L");
//			int age = 20;
			System.out.print(age);
			}
		catch (Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.print("program over");
		}

	}
}
