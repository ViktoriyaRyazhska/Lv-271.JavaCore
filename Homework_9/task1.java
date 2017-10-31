package homwork9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
	public static double div(double a, double b) {
		return a/b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter the value of the double a");
			double a = sc.nextDouble();
			System.out.println("enter the value of the double b");
			double b = sc.nextDouble();
			if(b==0) {
				System.out.println("You cannot divide by zero");
				System.exit(0);
			}
			System.out.println("a/b =" + div(a, b));
		} 
		catch (InputMismatchException e) {
			System.out.println("enter only numeric values");
			sc.nextLine();
		}
		catch (Exception e) {
			System.out.println("error");
		}
		sc.close();
	}
}
