package homework4;

import java.util.Scanner;

public class test1c {

	public static void main(String[] args) {
		System.out.println("Enter number of HTTP Error");
		Scanner sc = new Scanner(System.in);
		String error = sc.nextLine();
		switch (error) {
		case "400":
			System.out.println("Bad Request");
			break;
		case "401":
			System.out.println("Unauthorized");
			break;
		case "402":
			System.out.println("Payment Required ");
			break;
		case "403":
			System.out.println("Forbidden ");
			break;
		case "404":
			System.out.println("Not Found");
			break;
		case "405":
			System.out.println("Method Not Allowed");
			break;
			
		}
	}

}
