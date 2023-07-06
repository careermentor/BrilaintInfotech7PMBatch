package basicsJava;

public class Calculators 
{
	
	public Calculators()   // constructor - no argument/parameter
	{
		System.out.println("this is constructor");
	}
	
	
	public Calculators(int a)   //constructor has argument/parameter
	{
		int b = a*a;
		System.out.println("print the value of sq a: " + b);
		
		
	}
	
	

	public void sum_old()    // method without argument/parameter  // output can be used in another place - void
	{
		int a = 20;
		int b = 30;
		int c = a + b;
		
		System.out.println("sum of a&b: "  + c);
		
	}
	
	public int sum_new(int a, int b)  // method with arguments/parameters  // output
	{
		int c = a+b;
		System.out.println("sum of a&b: " + c);
		return c;
		
		//10+20+30
		
	}
	
	public int sum_new(int a)  // method with arguments/parameters  // output
	{
		int c = a+a;
		System.out.println("sum of a&b: " + c);
		return c;
		
		//10+20+30
		
	}
	
	
	public static void main(String[] args) 
	{
		
		Calculators cal = new Calculators();  //object of the class - constructor will be called automatically  
		Calculators cal1 = new Calculators(5);
		cal.sum_old();
		cal.sum_new(20, 40);
		cal.sum_new(50, 100);
		int x = cal.sum_new(10, 20);  //30
		cal.sum_new(x, 30); //60
		cal1.sum_new(20);
		
	}
	
}
