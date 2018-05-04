package com.tv;

public class test_number6 {

	public static void main(String[] args) {
//	  int a =5;
//	  double b =2.8;
//	  int  c =a+(int)b;
//	 System.out.println(c);
	String str = " you are hell world ";
	String str1 = "likeyou";
	String s1= "student";
	
	System.out.println(str.length());//string  length 字节的长度；
	System.out.println(str.lastIndexOf("l"));//string  lastIndexOf中 最后字下标位置；
	System.out.println(str.indexOf("h"));//string  indexOf第一次出现的下标位置数；
	System.out.println(str.charAt(9));//string    charAt获取下标数字的字母；
	System.out.println(str.substring(3,7));//string   substring获取下标数字的截取；
	System.out.println(str.trim().length());//string   trim去除前后空格；
	System.out.println(str.replace("you", "I"));//string  字符｜｜字字符串的替换；
	
	boolean b = str1.startsWith("k"); //判断字符串的开始与结尾是不否以指定的内容开始或结束；
	boolean b1 = str1.endsWith("you");//
	System.out.println(b);
	System.out.println(b1);
	
	String a1 = "hello";//equals equalsIgnore都是相等的意思 ，都是用是匹配字符串相等否；
	String a2 = "Hello";
	boolean flag = (a1.equalsIgnoreCase(a2));
	System.out.println(flag);
	
	
	String h="a";
	String h1 ="c";
	String h2 ="b";
	System.out.println("\n"+h1 +"compareTo" +h+":"+ h1.compareTo(h));
	System.out.println("\n"+h +"compareTo" +h2+":"+ h.compareTo(h2));     
	}

}