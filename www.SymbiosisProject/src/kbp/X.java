package kbp;

public class X {
	static {
		System.out.println("static block");
	}
	{
		System.out.println("Non static block");
	}
	X(){
		System.out.println("Constructor");
	}
	

}
