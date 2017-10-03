package l3;

public class Student {
	private static int sum = 0;
	private static int count = 0;
	
	private String name;
	private int rait;
	
	public Student(String name, int rait) {
		this.name = name;
		this.rait = rait;
		sum = sum + rait;
		count++;
	}
	
	public Student(String name) {
		this.name = name;
		count++;
	}
	
	public Student() {count++;}

	public String getName() {
		return name;
	}
	public int getRait() {
		return rait;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRait(int rait) {
		sum = sum - this.rait;
		this.rait = rait;
		sum = sum + rait;
	}
	
	public boolean betterStudent(Student s){
		return this.rait > s.getRait();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rait=" + rait + "]";
	}
	
	public static double avg(){
		return (double)sum / count;
	}
	
	

	

	
}
