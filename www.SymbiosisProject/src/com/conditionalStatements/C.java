package com.conditionalStatements;

public class C {
	public static void main(String args[]) {
		int a = 100;
		if(a>=75) {
			System.out.println("Distinction");
		}
		else if(a>60&a<75) {
			System.out.println("Second class");
			
		}
		else if(a<60&a>50) {
			System.out.println("Second class")
;		}
		else if(a>35&a<50) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Falils");
		}
	}

}
