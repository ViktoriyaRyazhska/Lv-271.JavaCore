package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		List<Integer> myCollection = new ArrayList<Integer>();
		myCollection.add(4);
		myCollection.add(8);
		myCollection.add(14);
		myCollection.add(424);
		myCollection.add(-445);
		myCollection.add(8);
		myCollection.add(44);
		myCollection.add(21);
		myCollection.add(-4);
		myCollection.add(19);
		List<Integer>newCollection = new ArrayList<Integer>();
		int i;
		for(i=0; i<myCollection.size(); i++) {
			if(i>=5) {
				newCollection.add(myCollection.get(i));
			}
		}
		System.out.println("newCollection");
		Iterator it = newCollection.iterator( );
		 while (it.hasNext( )) {
		 System.out.println (it.next( ));
		 } 
	
		System.out.println("myCollection<20");
		for(i=0; i<myCollection.size(); i++) {
			if(myCollection.get(i)>20) {
				myCollection.remove(i);
				i--;
			}
		}
		it = myCollection.iterator( );
		 while (it.hasNext( )) {
		 System.out.println (it.next( ));
		 } 
		System.out.println("myCollection with new numbers");
		myCollection.add(2, 1);
		myCollection.add(8, -3);
		myCollection.add(5, -4);
		for(i=0; i<myCollection.size(); i++) {
			System.out.println("position – " + i + ", value of element: " + myCollection.get(i));
		}
		Collections.sort(myCollection, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		System.out.println("Sort");
		it = myCollection.iterator( );
		 while (it.hasNext( )) {
		 System.out.println (it.next( ));
		 } 
	}

}

	