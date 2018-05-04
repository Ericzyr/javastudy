package com.tv;
import java.util.Scanner;
import java.util.Arrays;
public class test_number4 {
	public static void main(String[] args){
		int arr[]= new int [5];
		Scanner inputnumber =new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			System.out.println("输入数字第"+(i+1)+"次");
			arr[i] = inputnumber.nextInt();	
		}
		Arrays.sort(arr);
		for(int i =0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]);
		}
		inputnumber.close();
	} 
}
