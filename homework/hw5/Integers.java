package homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;

public class Integers {

	private int number;
	private int[] array10 = new int[10];
	private int[] array5 = new int[5];

	public int getNumber() {
		return number;
	}

	public int[] getArray10() {
		return array10;
	}

	public int[] getArray5() {
		return array5;
	}

	public void setArray10(int[] array10) {
		this.array10 = array10;
	}

	public void setArray5(int[] array5) {
		this.array5 = array5;
	}

	public Integers() {
	}

	/*
	 * public void inputIntegers(BufferedReader br) throws
	 * NumberFormatException, IOException {
	 * System.out.println("Enter the amount of integers: "); this.number =
	 * Integer.parseInt(br.readLine());
	 * System.out.println("Enter the numbers: "); for (int i = 0; i <
	 * this.number; i++) { this.array[i] = Integer.parseInt(br.readLine()); } }
	 */
	public void inputIntegers(BufferedReader br, int[] array) throws NumberFormatException, IOException {
		System.out.println("Enter integers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
	}

	public void sumOrProduct(int[] numbers) {
		int sum = 0;
		int product = 1;
		int count = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				if (i < 5) {
					sum += numbers[i];
				}
				count++;
			} else {
				break;
			}

		}
		for (int j = (numbers.length - 5); j < numbers.length; j++) {
			product *= numbers[j];
		}
		if (count == numbers.length) {
			System.out.println("The sum is " + sum);
		} else {
			System.out.println("The product is:" + product);
		}

	}

	public void minimumAndPos(int[] numbers) {
		int position = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				position++;
				if (position == 2) {
					System.out.println("The second positive number is " + numbers[i]);
				}
			}
		}
		int min = numbers[0];
		int pos = 0;
		for (int i = 1; i < (numbers.length); i++) {
			if (numbers[i] < min) {
				min = numbers[i];
				pos = i;
			}
		}
		System.out.println("Minimum is:" + min + " and it's position is " + (pos + 1));
	}

	public void inputTillNeg(BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Enter integers till negative");
		int i = 0;
		int product = 1;
		int[] array = new int[1000];
		while (i < 1000) {
			array[i] = Integer.parseInt(br.readLine());
			if (array[i] < 0)
				break;
			product *= array[i];
			i++;
		}
		System.out.println("The array is:");
		for (int j = 0; j < i; j++) {
			System.out.println(array[j]);
		}
		System.out.println("The product is: " + product);
	}
}
