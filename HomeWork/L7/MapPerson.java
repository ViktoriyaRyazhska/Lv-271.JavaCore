package HomeWork.L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MapPerson {

	public static void main(String[] args) throws IOException {

		Map<String, String> mapPerson = new HashMap<String, String>();

		mapPerson.put("Shved", "Roma");
		mapPerson.put("Kornev", "Vasya");
		mapPerson.put("Kagan", "Galya");
		mapPerson.put("Kozak", "Vitalik");
		mapPerson.put("Barnay", "Ira");
		mapPerson.put("Kravets", "Nazar");
		mapPerson.put("Gentosh", "Roma");
		mapPerson.put("Scop", "Mike");
		mapPerson.put("Bond", "James");
		mapPerson.put("Simpson", "Gomer");

		for (Map.Entry<String, String> n : mapPerson.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}

		System.out.println(" ");
		System.out.println("Please enter the name you want to check");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String m = reader.readLine();
		int x = 0;
		for (Map.Entry<String, String> n : mapPerson.entrySet()) {

			if (n.getValue().equals(m)) {
				x++;
			}
		}
		System.out.println("Name " + m + " repited " + x + " times.");

		System.out.println(" ");
		System.out.println("Please enter the name you want to delete");
		String del = reader.readLine();

		for (Iterator i = mapPerson.entrySet().iterator(); i.hasNext();) {
			Map.Entry entry = (Map.Entry) i.next();

			if (entry.getValue().equals(del)) {
				i.remove();
			}
		}
		for (Map.Entry<String, String> n : mapPerson.entrySet()) {
			System.out.println(n.getKey() + " " + n.getValue());
		}
	}
}
