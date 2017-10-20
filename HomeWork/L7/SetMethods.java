package HomeWork.L7;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(0);
		set1.add(3);
		set1.add(4);
		set1.add(6);
		set1.add(9);

		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(5);
		set2.add(7);
		set2.add(6);
		set2.add(9);

		union(set1, set2);
		intersect(set1, set2);

		
	}

	private static void union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new HashSet<Integer>(set1);
		set3.addAll(set2);
		System.out.println(set3);
	}

	private static void intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set4 = new HashSet<Integer>(set1);
		set4.retainAll(set2);
		System.out.println(set4);
	}
}
