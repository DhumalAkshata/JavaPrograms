package com.symbiosis.Javabasic;

public class methods {
	public void m1() {
		System.out.println("Inside m1");
		
	}
	public int m2() {
		System.out.println("Inside m2");
		
		return 0;
	}
	public boolean m3() {
		return true;
	}
	public float m4() {
		return 2.34f;
	}
	public static void main(String args[]) {
      	methods obj = new methods();
      	obj.m1();
      	obj.m2();
	}
	

}
