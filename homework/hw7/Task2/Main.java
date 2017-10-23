package homework.hw7.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Vikhot", "Ruslan");
		personMap.put("Kovalchyk", "Vasya");
		personMap.put("Gryb", "Yura");
		personMap.put("Pavliv", "Roman");
		personMap.put("Chuchman", "Oleg");
		personMap.put("Grechuh", "Roman");
		personMap.put("Golubev", "Pavlo");
		personMap.put("Paluh", "Nazar");
		personMap.put("Pavlyshun", "Yura");
		personMap.put("Uglar", "Markiyan");
		System.out.println("Persons: ");
		for (Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		sameName(personMap);
		System.out.println("Enter the name of person u want to delete from list:");
		String name = br.readLine();
		deleteName(personMap, name);
	}

	public static void sameName(Map<String, String> map) {
		System.out.println("Persons with the same first name: ");
		for (Entry<String, String> entry : map.entrySet()) {
			for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
				Map.Entry entry1 = (Map.Entry) it.next();
				if (entry.getValue().equals(entry1.getValue())) {
					if (!(entry.getKey().equals(entry1.getKey()))) {
						System.out.println(entry.getKey() + " " + entry.getValue());
					}
				}
			}
		}
	}

	public static void deleteName(Map<String, String> map, String name) {
		for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
			Map.Entry entry = (Map.Entry) it.next();
			if (entry.getValue().equals(name)) {
				it.remove();
				;
			}
		}
		System.out.println("List without " + name + ":");
		for (Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
	}
}
