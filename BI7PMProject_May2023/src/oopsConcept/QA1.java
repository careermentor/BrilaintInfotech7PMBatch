package oopsConcept;

public class QA1 
{

	int  i = 100;
	
	public void sum(int a, int b)   ///method declaration
	{
		int c = a+b;									//method body
		System.out.println("sum of a&b: "  + c);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of a&b: "  + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of a&b&c: "  + d);
	}
	

	
	
	public static void main(String[] args) 
	{
		QA1 q1 = new QA1();
		q1.sum(10, 20);
		
		q1.sum(10, 20, 30);
		q1.sum(10, 20.5f);
	
	}
}
