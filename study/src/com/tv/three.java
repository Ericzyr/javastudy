package com.tv;
import java.util.Scanner;

class A{
	
}

public class three {
	public final int count=1;
	public static void main(String[] args) {
		Scanner inputword= new Scanner(System.in);
	for(int i=0 ;i<3;i++){	
		try{
			System.out.print("input a number:");
			int a= inputword.nextInt();
			System.out.print("agin input a number");
			int b= inputword.nextInt();
			
		    int c=a%b;
		    System.out.println(c);
		}
		catch(Exception e){
			try{
				System.out.print("第二次异常");
				int w=2;
				System.out.print("threefrist input a number");
				int d= inputword.nextInt();
			    System.out.println(w%d);
			}
			catch(RuntimeException re ){
				System.out.print("确是存在错误");
			}
		}

	}
	}

}
