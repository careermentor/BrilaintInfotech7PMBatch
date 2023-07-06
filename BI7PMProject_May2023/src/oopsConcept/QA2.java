package oopsConcept;

public class QA2 extends QA1  //inheritance
{
	int i = 500; 
		
	public void sum(int a, int b)   ///method declaration
	{
		int c = a*a+b*b;									//method body
		System.out.println("sum of a&b: "  + c);
		
		int  i =1000;
		
		System.out.println(i);  //1000
		System.out.println(this.i); //500
		
		System.out.println(super.i);  //100
	}
	
	public void callsum()
	{
		super.sum(10,20);  
		
	}
	
	public void sub(int a, int b)
	{
		int c = a-b;
		System.out.println("sub of a&b: "  + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA2 q2 = new QA2();
		q2.sub(50, 20);
		q2.sum(10, 20);  //500
		q2.callsum();  //30
		q2.sum(10, 20, 30);
		
		
		
		
	}

}
