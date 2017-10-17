package PracticalWork.L5.L6;

public class Teacher extends Staff{
	public final String TYPE_PERSON = "Teacher";
	

	@Override
	public int salary() {
		
		return 15000;
	}

	@Override
	public void print() {
		System.out.println("I am a Teacher");
		
	}
	public Teacher()
	{
		System.out.println(TYPE_PERSON);
	}
}
