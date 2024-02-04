package kbp;

public class nonstatic {
	{
		System.out.println("Non stataic block 1");
	}
	{
		System.out.println("non static block 2");
	}
	public static void main(String args[]) {
		nonstatic no = new nonstatic();
	}

}
//Non static Block  