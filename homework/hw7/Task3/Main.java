package homework.hw7.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Student> studentsList = new ArrayList<Student>();
		studentsList.add(new Student("Ruslan", 5));
		studentsList.add(new Student("Nazar", 4));
		studentsList.add(new Student("Oleg", 5));
		studentsList.add(new Student("Yura", 3));
		studentsList.add(new Student("Vasya", 2));
		studentsList.sort(new CompareName());
		System.out.println("Sorted by name:");
		for(Student stud: studentsList){
			System.out.println(stud);
		}
		System.out.println("Sorted by course");
		studentsList.sort(new CompareCourse());
		for(Student stud: studentsList){
			System.out.println(stud);
		}
		System.out.println("Enter the course: ");
		int course = Integer.parseInt(br.readLine());
		System.out.println("Students of " + course + " course");
		Student st = new Student();
		st.printStudents(studentsList, course);
		
	}
}
