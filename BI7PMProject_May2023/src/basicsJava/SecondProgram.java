package basicsJava;

public class SecondProgram 
{
	
	int i = 100; //variable (global)
	
	
	public void method1()
	{
		final int i = 20; //variable (local)  -- constant
		//i=30;
		
		System.out.println("this is simple method");
		System.out.println(i);  //20
	}
	
	public void printvalue()
	{
		
		int i = 10; //variable (local)
		int j = 50;
		
		System.out.println(i+j);
		System.out.println("this is text" + i);
		
		System.out.println("This is value of i: "  + i);  //10
		
		System.out.println(this.i); //100
	}
	
	public static void main(String[] args)
	{
		SecondProgram sp = new SecondProgram();
		sp.method1();
		sp.printvalue();
	}
	
}
