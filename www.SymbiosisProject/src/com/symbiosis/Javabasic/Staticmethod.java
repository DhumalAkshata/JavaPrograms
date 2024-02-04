package com.symbiosis.Javabasic;

public class Staticmethod {
	public static void m1() {
		System.out.println("Inside m1");
	}
	public void m2() {
		System.out.println("Inside m2");
	}
	public static void main(String args[]) {
    	 //Staticmethod.m1();
    	 //Staticmethod.m2();
    	
    	Staticmethod obj = new Staticmethod();
    	//obj.m2();
    	//obj.m1();
		
	}

}
 