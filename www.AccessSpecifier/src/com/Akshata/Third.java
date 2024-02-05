package com.Akshata;
import com.Aditya.First;
//To import package import -> package name -> class name

public class Third {
	public static void main(String args[]) {
		First obj = new First();
		System.out.println("private:"+obj.pv);
		System.out.println("default:"+obj.df);
		System.out.println("public:"+obj.pb);
		System.out.println("protected:"+obj.pr);
		
	}

}
//private, default, protected are not accessed in different package
//only public is access in different package