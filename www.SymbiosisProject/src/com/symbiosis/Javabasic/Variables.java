package com.symbiosis.Javabasic;

public class Variables {
	int a = 10;//global variable - Global variables are those variables which are declared outside of all the functions or block and can be accessed globally in a program.
 
	public void m1(int b){

	b =30;//Local variable - Variables that are declared within or inside a function block are known as Local variables.

	System.out.println(a);

	System.out.println(b);

	}

	public void m2() {

	System.out.println(a);

	//System.out.println(b);

     }
	


}
