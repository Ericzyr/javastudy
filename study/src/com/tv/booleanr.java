package com.tv;








class People{ 
	public boolean monday(int x,int y){
		return x>y;
	}
}

public class booleanr {
	public static void main(String[] args) {
		People p = new People();
		boolean flag=p.monday(1,2);
		
		System.out.println(flag);

	}

}
