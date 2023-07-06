package oopsConcept;

public class QA4 extends QA2 //implements QA3I
{

	

	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("mul of a&b: "  + c);
	}
	
	
	public static void main(String[] args) 
	{
		QA4 q4 = new QA4();
		//q3.sum(10, 20);
		//q3.sub(50, 20);
		//q3.mul(10, 20);
	}


	
	public void QA3M() {
		System.out.println("this is QA3I interface method");
		
	}
}
