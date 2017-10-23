package PractiseTask.l7.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Ruslan");
		employeeMap.put(2, "Oleg");
		employeeMap.put(3, "Mykola");
		employeeMap.put(4, "Oleg");
		employeeMap.put(5, "Rostyk");
		employeeMap.put(6, "Vasya");
		employeeMap.put(7, "Andriy");
		for (Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("Enter ID:");
		int id = Integer.parseInt(br.readLine());
		if (employeeMap.containsKey(id)) {
			System.out.println(employeeMap.get(id));
		} else {
			System.out.println("No employee with this ID");
		}
		System.out.println("Enter the name: ");
		String name = br.readLine();
		if (employeeMap.containsValue(name)) {
			for (Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println(entry.getKey() + " " + entry.getValue());
				}
			}

		} else {
			System.out.println("No employees with name " + name);
		}
	}

}
