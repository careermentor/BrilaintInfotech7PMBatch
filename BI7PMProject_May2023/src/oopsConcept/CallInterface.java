package oopsConcept;

public class CallInterface implements LearnInterface
{

	
	public void method3() 
	{
	
		System.out.println("this is method3");
	}

	
	public void method4()
	{
	System.out.println("this is method4");
		
	}


	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.method3();
		ci.method4();
	}
	
	
	// class vs class -- extends
	//interface vs class - implements
	//interface vs interface - extends
	
}
