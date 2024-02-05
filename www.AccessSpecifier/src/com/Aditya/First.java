package com.Aditya;

public class First {
	private String pv = "private";
	//Access Specifier ->Return type -> variable name -> value
	String df = "default";
	public String pb = "public";
	protected String pr = "protected";
	public static void main(String args[]) {
		First obj = new First();
		System.out.println("private:"+obj.pv);
		System.out.println("default:"+obj.df);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pr);
	}
}