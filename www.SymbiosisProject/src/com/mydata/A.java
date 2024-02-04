package com.mydata;

import com.symbiosis.Javabasic.B;

public class A {
	{
	System.out.println("Inside static block");
	}

}
public void m1() {
	A ab = new A();
	System.out.println("m1");
}
public static void main(String[]args) {
	B ab = new B();
	ab.m1();
}



//We can create same class name in different package but not in same package
