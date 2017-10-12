package homework5;

import java.util.Scanner;

public class test3 {
	public static void main(String[] args) {
		System.out.println("Enter 5 integer numbers");
		Scanner sc = new Scanner(System.in);
		int numbers [] = new int[5];
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		int spn=0;   // second positive number
		int count=0;
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]>0) {
				count++;
			}
			if(count==2){
				spn = i;
				break;
			}
		}
		System.out.println("position of second positive number is " + (spn+1));
		int min= numbers[0];
		int position =0;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]<min) {
				min = numbers[i];
				position = i;
			}
		}
		System.out.println("The smallest number is " + min + " its position " + (position+1));
	}
}
