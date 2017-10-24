package homework7;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import org.omg.CORBA.PUBLIC_MEMBER;

public class task1 {
	private static final int Set = 0;

	public static void main(String[] args) {
		Set<Integer> set1 = new TreeSet<Integer>();
		set1.add(0);
		set1.add(2);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		Set<Integer> set2 = new TreeSet<Integer>();
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);
		set2.add(7);
		set2.add(8);
		set2.add(9);
		union(set1, set2);
		intersect(set1, set2);
	}

		
	private static void intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new TreeSet<Integer>(set1);
		set3.addAll(set2);
		System.out.println(set3);
		
	}

	private static void union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set3 = new TreeSet<Integer>(set1);
		set3.retainAll(set2);
		System.out.println(set3);
		
	}
}
