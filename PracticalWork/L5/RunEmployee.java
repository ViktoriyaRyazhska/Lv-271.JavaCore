package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunEmployee {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Employee[] employee = new Employee[5];
		employee[0] = new Employee("Roma", 3, 2000);
		employee[1] = new Employee("Vasya", 2, 5000);
		employee[2] = new Employee("Petro", 2, 7000);
		employee[3] = new Employee("Meison", 1, 1000);
		employee[4] = new Employee("Lesyk", 4, 1500);

		Employee tmp = new Employee();
		for (int i = 0; i < employee.length - 1; i++) {
			for (int x = i + 1; x < employee.length; x++) {
				if (employee[i].getSalary() < employee[x].getSalary()) {
					tmp = employee[i];
					employee[i] = employee[x];
					employee[x] = tmp;
				}
			}
		}

		/*
		 * for (int i = 0; i < employee.length; i++)
		 * System.out.println(employee[i].getSalary());
		 */

		System.out.println("Please enter the number of Department.");
		int m = Integer.parseInt(reader.readLine());
		for (int i = 0; i < employee.length; i++) {
			if (m == employee[i].getDepartmentNumber()) {
				System.out.print(employee[i] + " ");
			}
		}
		System.out.print("are employees of " + m + " department.");
	}
}
