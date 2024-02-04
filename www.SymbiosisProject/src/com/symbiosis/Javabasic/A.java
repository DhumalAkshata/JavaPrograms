package com.symbiosis.Javabasic;

public class A {
	public void m1() {
	System.out.println("Inside m1");
}
	public static void m2() {
		System.out.println("Inside m2");
	}
	public static void main(String args[]) {
		  A.m2();
		  A ab = new A();
		  ab.m1();
		
	}

}
