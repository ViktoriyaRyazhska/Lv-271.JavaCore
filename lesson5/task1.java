package lesson5;

public class task1 {

	public static void main(String[] args) {
		int numbers [] = {5, -6, -24, 48, 2, 88, 92, 0, -8, 12};
		int max = numbers[0];
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>max) {
				max = numbers[i];
			}
		}
		System.out.println("The biggest number is " + max);
		int sum = 0;
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i]>0) {
				sum += numbers[i];
				continue;
			}
		}
		System.out.println("Sum of positive numbers = " + sum);
		int sum_negative=0;
		int i = 0;
		while (i<numbers.length) {
			if(numbers[i]<0) {
				sum_negative += numbers[i];
			}
			i++;
		}
		System.out.println("Sum of negative numbers = " + sum_negative);
	}
	
}
