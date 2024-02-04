package com.conditionalStatements;

public class A {
	public static void main(String args[]) {
		int i = 10;
		if(i==10){
			System.out.println("Inside if");
		}
		else if(i<20) {
			System.out.println("Inside else if");
		}
		else {
			System.out.println("Inside else");
		}
		
	}

}
//if condition is true then next condition are not executed
//if condition is true then it executed if false then else condition is executed
