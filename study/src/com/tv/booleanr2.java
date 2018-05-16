package com.tv;

import java.util.*;

import org.junit.Test;
class letv{

	int a=2;
	int b=2;
	
//	public boolean launch(String pkg){
//		if(a==b){
//			System.out.println("相等");
//			return true;
//		}else{
//			System.out.println("不相等");
//			return false;
////		return launchapp(pkg,true);
//		}
////		return false;
//	}
	
	
	
	public boolean launch(String pkg){
		return launchapp(pkg,true);
	}

	public boolean launchapp(String pkg,boolean flag){
		if(a==b){
			System.out.println("hello world");
			return true;
		}else{
			return false;
			}
		}
	}
public class booleanr2 {
	
	
	@Test
	public void test(){
		letv le=new letv();
		boolean flag=le.launch("ho");
		System.out.print(flag);
	}
	
	
//	public static void main(String[] args) {
//		letv le=new letv();
//		boolean flag=le.launch("ho");
//		System.out.print(flag);
//	}

}
