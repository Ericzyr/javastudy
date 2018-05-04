package com.tv;

public class test_number5 {
	
	int a=9,b=8;
	

	public static void main(String[] args) {
	 int arr[]=new int[]{223,23,56,78,504};
	 int max = arr[0],mix=arr[0];
	 for(int i=0; i<arr.length; i++){
		 if(max<arr[i]){
			 max =arr[i];
		 }
		 else if(max>arr[i]){
			 mix =arr[i];
		 }
	 }
	 System.out.print("最大值是："+max+"\n");
	 System.out.print("最小值是："+mix);
	}

}