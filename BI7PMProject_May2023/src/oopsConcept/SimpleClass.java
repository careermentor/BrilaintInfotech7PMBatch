package oopsConcept;

public abstract class SimpleClass    //concrete class//abstract
{
	
	int i  =20;
	

	public void method1()     // concrete method   //method declaration
	{
		int i  =20;
		i=30;
		
		System.out.println("this is simple method");  //method body
		System.out.println("username/password");
	}
	
	
	public abstract void method2();   // abstract
	
	
	public static void main(String[] args) 
	{
		//SimpleClass sc = new SimpleClass();
		//sc.method1();
	}
	
}
