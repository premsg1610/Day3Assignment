


//static:-    when code runs these members will be loaded on RAM and execution starts from main method.
//              it can be accessed through static method only.
//              main method should always be static.

//non-static:- these members will not loaded on RAM and to access it inside static member we have to make objects.
//             Then it occupies some memory space in heap memory of RAM and only contains signature (variables and method name and address).
//             when we call it then method body will be loaded on RAM dynamically.
//               Non-static can be access from another non-static method but to access it from static method we have to create objec.
        


package com.masai;

public class StaticNonStatic {

	int x = 1; 
	static int y = 5;  //static 
	
	void fun1() {       //non-static
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		
//		static can be called in three ways:
		
//	1. can be access directly:
		
		System.out.println(y);
		
//	2. using object:
		
		StaticNonStatic c1 = new StaticNonStatic();
		
		System.out.println(c1.y);
		
		
//	3. using classname. :
		System.out.println(StaticNonStatic.y);
				
		
// Accessing non static 
		
		StaticNonStatic c2 = new StaticNonStatic();
		
		c2.fun1();
		
	}	
}     
