package homework.hw7.Task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		final int size = 10;
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		Random rand = new Random();
		for (int i = 0; i < size; i++) {
			set1.add(rand.nextInt(20));
			set2.add(rand.nextInt(20));
		}
		System.out.println("set1: " + set1);
		System.out.println("set2: " + set2);
		unionSets(set1, set2);
		intersect(set1, set2);
	}

	static void unionSets(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> unionSet = new HashSet<Integer>(set1);
		unionSet.addAll(set2);
		System.out.println("Union set: " + unionSet);
	}

	static void intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> intersectSet = new HashSet<Integer>(set1);
		intersectSet.retainAll(set2);
		System.out.println("Intersect: " + intersectSet);
	}
}
