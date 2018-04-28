package com.tv;
import java.util.Arrays;
import java.util.Scanner;

public class array {

	public static void main(String[] args) {
//		int arr[]={23,78,78};
//		int arr1[]=new int[5];
//		arr1[0]=124;
//		System.out.println(arr1[0]);
		 
		Scanner input = new Scanner(System.in);
		System.out.println("输入学生的人数：");
		int num = input.nextInt();
		int arr[]=new int[num];
		int sum =0;
		for(int i =0; i<arr.length;i++){
			System.out.println("第"+(i+1)+"学生的成绩：");
			arr[i]= input.nextInt();
			sum =sum +arr[i];
		}
		Arrays.sort(arr);
		
	}

}