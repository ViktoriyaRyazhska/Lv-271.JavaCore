package PracticalWork.L7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Collection {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> myCollection = new ArrayList<Integer>();
		int n;
		for (int i = 0; i < 10; i++) {
			n = Integer.parseInt(reader.readLine());
			myCollection.add(n);
		}
		List<Integer> newCollection = new ArrayList<Integer>();
		for (int i = 0; i < myCollection.size(); i++) {
			if (i >= 5) {
				newCollection.add(myCollection.get(i));
			}
		}
		for (int i = 0; i < newCollection.size(); i++) {
			System.out.println(newCollection.get(i));
		}
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 20) {
				myCollection.remove(i);
				i--;
			}
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println(myCollection.get(i));
		}

		for (int i = 0; i < myCollection.size(); i++) {
			if (i == 2)
				myCollection.add(i, 1);
			if (i == 5)
				myCollection.add(i, -4);
			if (i == 8)
				myCollection.add(i, -3);
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("The position - " + i + " the value of element - " + myCollection.get(i));
		}

		Collections.sort(myCollection, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println("----------------------------------");
		for (int i = 0; i < myCollection.size(); i++) {
			System.out.println("The position - " + i + " the value of element - " + myCollection.get(i));
		}

	}

}
