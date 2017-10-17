package PracticalWork.L5.L6;

public class Cleaner extends Staff{
	public final String TYPE_PERSON = "Cleaner";
	@Override
	public int salary() {
		
		return 2500;
	}

	@Override
	public void print() {
		System.out.println("I am a Cleaner");
		
	}
	public Cleaner()
	{
		System.out.println(TYPE_PERSON);
	}

}
