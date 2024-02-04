package com.symbiosis.Javabasic;

public class calculator {
	int a= 100;
	int b= 10;
	public void getAdd() {
		System.out.println(a+b);	
	}
	public void getSub() {
		System.out.println(a-b);
	}
	public void  getMulti() {
		System.out.println(a*b);
	}
	public static void main(String args[]) {
		calculator obj = new calculator();
				obj.getAdd();
				obj.getSub();
				obj.getMulti();
				
	}

}
