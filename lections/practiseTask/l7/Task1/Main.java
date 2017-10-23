package PractiseTask.l7.Task1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		ArrayList<Integer> myCollection = new ArrayList<Integer>();
		Random random = new Random();
		final int amount = 10;
		System.out.println("Enter " + amount + " integers: ");
		for (int i = 0; i < amount; i++) {
			myCollection.add(random.nextInt(40));
		}
		System.out.println("Integers: ");
		System.out.println(myCollection);
		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		for (int i = 0; i < myCollection.size(); i++) {
			if (myCollection.get(i) > 5) {
				newCollection.add(myCollection.get(i));
			}
		}
		System.out.println("Integers >5:");
		System.out.println(newCollection);
		Iterator<Integer> it = myCollection.iterator();
		while (it.hasNext())
			if (it.next() > 20) {
				it.remove();
			}
		System.out.println("Integers < 20: ");
		System.out.println(myCollection);
		Insertion(myCollection, 1, 1);
		Insertion(myCollection, 4, -4);
		Insertion(myCollection, 7 , -3);
		System.out.println("Integers with insertions:");
		for(int i=0; i<myCollection.size(); i++){
			System.out.println("Possition: " + (i+1) + " Value: " + myCollection.get(i));
		}
		myCollection.sort(new IntComparator());
		System.out.println(myCollection);
	}

	public static void Insertion(ArrayList<Integer> list,int space, int value){
		if(space<=list.size()){
			list.add(space, value);
		}
		else{
//			space--;
			list.add(list.size(), 0);
			Insertion(list, space, value);
		}
	}
}
