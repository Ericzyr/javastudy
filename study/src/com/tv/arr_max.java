package com.tv;
import java.util.Scanner;
public class arr_max {
	public static void main(String[] args) {
	Scanner inputnumber = new Scanner(System.in);
	System.out.print("你要比较几数字？");
	int num = inputnumber.nextInt();
	int arr[] =new int[num];
	for(int i=0 ;i<arr.length;i++){
		System.out.println("输入第"+(i+1)+"数字");
		arr[i]=inputnumber.nextInt();
	}
	int max=arr[0];
	for(int i =0; i<arr.length; i++){
		if(max<arr[i]){
			max=arr[i];
		}
	}
	System.out.print("最大数字为："+max);	
}

}
