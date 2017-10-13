package homework5;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		System.out.println("Enter integer numbers");
		Scanner sc = new Scanner(System.in);
		boolean flag =true;
		int numbers;
		int product = 1;
		while(flag) {
			numbers = sc.nextInt();
			if (numbers<0) {
				flag = false;
			}
			product*=numbers;
				if (numbers<0) {
				product=product/numbers;
			}
		}
		System.out.println(product);
	}

}
