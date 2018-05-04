package com.tv;

public class try3 {
	static void pop()throws NegativeArraySizeException{
		System.out.print("没有异常");
		int[] arr = new int[33];
	}
	public static void main(String[] args) {
		try{
			pop();
	
		}
		catch(NegativeArraySizeException e){
		System.out.print(e);
		}

	}
 
	
	
}
