package oopsConcept;

public class PersonalClass extends SimpleClass 
{

	
	public void method2()
	{
		System.out.println("credintials");
		
	}
	
	public static void main(String[] args) {
		PersonalClass pc = new PersonalClass();
		
		pc.method1();
		pc.method2();
	}

}
