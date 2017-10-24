package homework7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<String, String>();
		personMap.put("Nazar", "Stepankiv");
		personMap.put("Taras", "Shevchenko");
		personMap.put("Vasyl", "Stus");
		personMap.put("Sonja", "Stepankiv");
		personMap.put("Natalya", "Bulka");
		personMap.put("Olga", "Vovk");
		personMap.put("Orest", "Soroka");
		personMap.put("Olena", "Bilka");
		personMap.put("Julia", "Koval");
		personMap.put("Solomija", "Vovk");
		for(Map.Entry<String, String> entry : personMap.entrySet() ) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
		System.out.println("Enter the name you want to check");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int count = 0;
		Iterator it = personMap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			if (entry.getValue().equals(name)){
				count++;
			}	
		}
		System.out.println("with the name " + name + " is " + count);
		System.out.println("Enter the name you want to remove");
		String nameRemove = sc.nextLine();
		Iterator i = personMap.entrySet().iterator();
		while(i.hasNext()) {
			Map.Entry entry = (Map.Entry) i.next();
			if (entry.getValue().equals(nameRemove)){
				i.remove();
				}
			}
		System.out.println("New person map:");
		for(Map.Entry<String, String> entry : personMap.entrySet() ) {
			System.out.println(entry.getKey() + " "+ entry.getValue());
		}
						 
	}

}
