package lesson4;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		System.out.println("Enter the day of the week, using numders 1 to 7");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if (number == 1) {
			System.out.println("Monday");
			System.out.println("��������");
			System.out.println("�����������");
		}
		if (number == 2) {
			System.out.println("Tuesday");
			System.out.println("³������");
			System.out.println("�������");
		}
		if (number == 3) {
			System.out.println("Wednesday");
			System.out.println("������");
			System.out.println("�����");
		}
		if (number == 4) {
			System.out.println("Thursday");
			System.out.println("������");
			System.out.println("�������");
		}
		if (number == 5) {
			System.out.println("Friday");
			System.out.println("�������");
			System.out.println("�������");
		}
		if (number == 6) {
			System.out.println("Saturday");
			System.out.println("C�����");
			System.out.println("C������");
		}
		if (number == 7) {
			System.out.println("Sunday");
			System.out.println("�����");
			System.out.println("�����������");
		}
		if (number<1||number>7) {
			System.out.println("You entered an incorrect value");
		}
	}

}
