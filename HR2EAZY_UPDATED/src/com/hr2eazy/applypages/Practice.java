package com.hr2eazy.applypages;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {
	
	public static void countstring() {
		String s;
		int i,j=0;
		System.out.println("Enter string to count");
		Scanner sc=new Scanner(System.in);
		s=sc.next();
		for(i=0;i<s.length();i++) {
			j++;
			
		}
		System.out.println("The length of the string is " +j);
	}
	
	public static void revstring() {
		System.out.println("Enter string to rev");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();char c;String revstr="";
		for(int i=0;i<=a.length()-1;i++) {
			c=a.charAt(i);
			System.out.println(a.charAt(i));
			revstr=c+revstr;
			System.out.println(revstr);
		}
		System.out.println(revstr);
	}
	
	public static void trim() {
	System.out.println("Enter sentence to trim spcaes");
	Scanner sc=new Scanner(System.in);
	String k=sc.nextLine();
	System.out.println(k);
	String j=k.trim();
	System.out.println(j);
	
	}
	public static void compare() {
		String a,b;
		System.out.println("Enter string to compare");
		Scanner s1=new Scanner(System.in);
		a=s1.next();
		System.out.println("Enter second string to compare");
		Scanner s2=new Scanner(System.in);
		b=s2.next();
		String c="now";
		System.out.println(a);
		System.out.println(b);
		if(a==b) {
			System.out.println("two strings are same");
		}
		else {
			System.out.println("not same");
		}
	}
	
	public static void forloop() {
		System.out.println("Enter text for all the below process");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(s.startsWith("m"));
		System.out.println(s.concat("lisa"));
		System.out.println(s.indexOf("a"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.indexOf("ya"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.replace("a", "oo"));
		System.out.println(s.replaceAll("[^0-9]", "///"));
		System.out.println(s.replaceFirst("[^0-9]", "ok"));
		System.out.println(s.substring(5));
		System.out.println(s.toCharArray());
		String l[]=s.split("/");
		for(String p:l) {
			System.out.println("The string is" +p);
		}
		
		}
	
	public static void arrstry() {
		int a;System.out.println("Enter the number word in sentence");
		Scanner num=new Scanner(System.in);
		a=num.nextInt();String str="";String atr;
		ArrayList<String> ab=new ArrayList<String>();
		System.out.println("Enter"+a+"number of words");
		for(int i=0;i<=a;i++) {
			//System.out.println("Enter"+i+"st word in sentence");
		Scanner sc=new Scanner(System.in);
		atr=sc.nextLine();
		
		ab.add(atr);
		}
		System.out.println(ab);
		System.out.println(ab.contains("new"));
		if(ab.contains("new")) {
			System.out.println("exists");
		}

	}
	public static void main(String[] args) {
	/*countstring();	
	revstring();
	trim();
	compare();*/
		forloop();
		arrstry();
	}

}
