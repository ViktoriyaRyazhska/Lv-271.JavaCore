package l3;

public class Appl {

	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Ira");
		st.setRait(5);
		
		Student st2 = new Student("Petro", 4);
		System.out.println(st);
		System.out.println(st2);
		System.out.println(Student.avg());
	}

}
