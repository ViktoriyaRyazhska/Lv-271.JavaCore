package PractiseTask.l5;

import java.io.BufferedReader;
import java.io.IOException;

public class Integers {

	private int[] numbers = new int[10];

	public Integers() {
	}

	public void inputIntegers(BufferedReader rd) throws NumberFormatException, IOException {
		System.out.println("Enter " + numbers.length + " integers");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(rd.readLine());
		}
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public int theBiggestNumb(int[] numbers) {
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("The biggest number is " + max);
		return max;
	}

	public int sumOfPossitive(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				sum += numbers[i];
			}
		}
		System.out.println("The sum of possitive numbers is: " + sum);
		return sum;
	}

	public int negativeAmmount(int[] numbers) {
		int amount = 0;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]<0){
				amount++;
			}
		}
		System.out.println("The amount of negative integers is: " + amount);
		return amount;
	}
}
