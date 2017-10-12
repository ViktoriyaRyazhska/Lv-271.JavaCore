package homework5;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		int days [] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("enter the month number");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		for(int i =0; i<days.length; i++) {
			if(month-1==i) {
				System.out.println("this month has " + days[i] + " days.");
			}
		}
	}

}
