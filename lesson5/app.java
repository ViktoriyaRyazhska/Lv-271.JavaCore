package lesson5;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Employee[] emps = new Employee[7];
		emps[0] =new Employee("Petrenko", 1, 8000);
		emps[1] =new Employee("Ivanov", 2, 12000);
		emps[2] =new Employee("Shevchenko", 2, 11500);
		emps[3] =new Employee("Kovalenko", 3, 7800);
		emps[4] =new Employee("Tkachenko", 1, 14000);
		emps[5] =new Employee("Shevchuk", 2, 18000);
		emps[6] =new Employee("Tkachuk", 3, 12800);
		System.out.println("Enter the number of departments from 1 to 3 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i=0; i<emps.length; i++) {
			if(emps[i].getNumber()==num) {
				emps[i].output();
				continue;
			}
		}
		System.out.println("Зарплата працывників по спаданню:");
		
		Employee tmp = new Employee ();
		for (int i = 0; i < emps.length - 1; i++) {
		for (int j = i + 1; j < emps.length; j++) {
		 if (emps[i].getSalary()<emps[j].getSalary()) {
			 tmp = emps[i];
		 emps[i] = emps[j];
		 emps[j] = tmp;
		 }
		 }
		}
		for (int i = 0; i < emps.length; i++) {
			emps[i].output();
		}
	}

}
