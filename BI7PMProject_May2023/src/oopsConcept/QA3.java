package oopsConcept;

public class QA3 extends QA1
{

	

	public void mul(int a, int b)
	{
		int c = a*b;
		System.out.println("mul of a&b: "  + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA3 q3 = new QA3();
		q3.sum(10, 20);
		//q3.sub(50, 20);
		q3.mul(10, 20);
	}
}
