package PracticalWork.L5.L6;

public class Student extends Person {
	public final String TYPE_PERSON = "Student";
	
	
	

	public void print()
	{
		System.out.println("I am a Student");
	}
	
	public Student()
	{
		System.out.println(TYPE_PERSON);
	}

}
