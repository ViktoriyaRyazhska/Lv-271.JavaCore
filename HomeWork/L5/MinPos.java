package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinPos {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] num = new int[5];
		System.out.println("Enter 5 integer numbers.");

		for (int i = 0; i < num.length; i++) {
			int n = Integer.parseInt(reader.readLine());
			num[i] = n;
		}

		int x = 0;
		int n = 0;
		for (int i = 0; i < num.length; i++) {

			if (num[i] > 0) {
				x++;
				if (x == 2) {
					n = i;
					break;
				}
			}
		}
		System.out.println("Position of second positive number is " + (n + 1) + ".");
		int m = num[0];
		int min = 0;
		for (int i = 1; i < num.length; i++) {
			if (m > num[i]) {
				m = num[i];
				min = i;
			}
		}
		System.out.println("The position of minimum number in the array is " + (min + 1) + ".");
	}

}
