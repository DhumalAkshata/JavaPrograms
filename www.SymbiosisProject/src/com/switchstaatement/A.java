package com.switchstaatement;

public class A {
	public static void main(String args[]) {
		int a= 8;
		switch(a) {
		case 1:
			System.out.println("Inside case 1");
			break;
		case 2:
			System.out.println("Inside case 2");
			break;
	    default:
	    	System.out.println("Inside default");
		}
	}

}
//same case number are not allowed eg 1 and 1, 5 and 1+4
// If there is not break  then next case are also executed
//execution run from top to bottom and left to right