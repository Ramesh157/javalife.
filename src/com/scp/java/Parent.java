package com.scp.java;

public class Parent {
	void m1()
	{ System.out.println("parent m1() method");
	}
}
class Child extends Parent
{ void m1()
	{System.out.println("child m1() method");
	}
   void m2()
   {System.out.println("child m2() method");
   }
    public static void main(String []args) 
    { Parent p = new Child();
    p.m1();
		
	}


} 


