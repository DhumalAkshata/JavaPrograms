package com.loop;

public class C {
	/*public static void main(String args[]) {
		boolean a = true;
		int i = 10;
		while(i<20) {
			if(i==15) {
				a= false;
			}
			else {
				System.out.println(i);
			}
		}
		i++;
	}

}*/
//output infinite loop
	
	public static void main(String args[]) {
		boolean a = true;
		int i = 10;
		while(i<20) {
			if(i==15) {
				a= false;
			}
			else {
				System.out.println(i);
			}
			i++;
		}

	}
	// 15 is not print

}