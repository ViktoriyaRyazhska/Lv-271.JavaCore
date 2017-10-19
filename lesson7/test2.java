package lesson7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(101, "Andriy");
		employeeMap.put(102, "Oleg");
		employeeMap.put(103, "Solomija");
		employeeMap.put(104, "Olga");
		employeeMap.put(105, "Oksana");
		employeeMap.put(106, "Ivan");
		employeeMap.put(107, "Olya");
		for(Map.Entry<Integer, String> entry : employeeMap.entrySet() ) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		System.out.println("Enter Id number:");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		if(employeeMap.containsKey(k)) {
			System.out.println("this Id belongs to " + employeeMap.get(k));
		}
		else {
			System.out.println("We don't have employees on this Id.");
		}
		System.out.println("Enter name:");
		sc = new Scanner(System.in);
		String n = sc.nextLine();
		if(employeeMap.containsValue(n)){
			for(Map.Entry<Integer, String> i : employeeMap.entrySet() ) {
				if(i.getValue().equals(n)) {
					System.out.println("This employee has an id number " + i.getKey());
				}
			}
		}
		else {
			System.out.println("We don't have employees with this name.");
		}
		sc.close();
	}

}