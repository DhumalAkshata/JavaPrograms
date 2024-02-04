package com.mydata2;

public class A {
	static int a =10; // its can't be local
	public static void m1() {
		System.out.println(a);
	}
	public static void main(String args[]) {
		A obj = new A();
		obj.m1();
	}

}
