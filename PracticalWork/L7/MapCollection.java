package PracticalWork.L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) throws IOException {
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		employeeMap.put(2341, "Roma");
		employeeMap.put(2342, "Taras");
		employeeMap.put(2343, "Dido");
		employeeMap.put(2344, "Serg");
		employeeMap.put(2345, "Nona");
		employeeMap.put(2346, "Dred");
		employeeMap.put(2347, "Yoda");

		for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please enter id number.");

		int n = Integer.parseInt(reader.readLine());
		if (employeeMap.containsKey(n)) {
			System.out.println("This id belongs to " + employeeMap.get(n) + ".");
		} else {
			System.out.println("Sorry. There is no such id in the data base.");
		}
		System.out.println("***********************");
		System.out.println(" ");
		System.out.println("Please enter the name.");
		String m = reader.readLine();

		if (employeeMap.containsValue(m)) {
			for (Map.Entry<Integer, String> i : employeeMap.entrySet()) {
				if (i.getValue().equals(m)) {
					System.out.println("This name belongs to id " + i.getKey() + ".");
				}
			}

		} else {
			System.out.println("Sorry. There is no such id in the data base.");
		}

	}

}
