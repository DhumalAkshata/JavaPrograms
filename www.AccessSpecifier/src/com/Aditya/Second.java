package com.Aditya;

public class Second {
	public static void main(String args[]) {
		First obj = new First();
		System.out.println("private:"+obj.pv);//private is only accessed in same class
		System.out.println("default:"+obj.df);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pr);
	}

}
