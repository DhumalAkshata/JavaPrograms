package kbp;

public class Allinone {
	public Allinone() {
		System.out.println("constructor");
		
	}
	static{
		System.out.println("Static block");
		
	}
	{
		System.out.println("Non static block");
	}
	public static void main(String args[]) {
		Allinone obj = new Allinone();
	}
	

}
//First static block run then non static block then constructor
