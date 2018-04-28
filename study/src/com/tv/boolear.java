package com.tv;
import java.util.*;
public class boolear {

public static void main(String[] args) {	
		Scanner iputtext=new Scanner(System.in);
		System.out.println("输入一个要查找的名字");
		String text =iputtext.next();
		String arr[]={"王阳明","周瑜","刘备","kk"};
		boolean flag=false;
			for(int i=0;i<arr.length;i++){
					if(text.equals(arr[i])){
						flag = true;
						System.out.println("里面有这个名字");
						break;
					}
				}
		if(flag ==true ){
			System.out.println("里面有这个名字");
		}
		else{
			System.out.println("没有找到这个名字");
		}
	}
}

