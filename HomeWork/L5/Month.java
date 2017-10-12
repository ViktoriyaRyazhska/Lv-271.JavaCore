package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Month {

	public static void main(String[] args) throws IOException {

		int[] dayOfMonth = new int[13];
		dayOfMonth[0] = 0;
		dayOfMonth[1] = 31;
		dayOfMonth[2] = 28;
		dayOfMonth[3] = 31;
		dayOfMonth[4] = 30;
		dayOfMonth[5] = 31;
		dayOfMonth[6] = 30;
		dayOfMonth[7] = 31;
		dayOfMonth[8] = 31;
		dayOfMonth[9] = 30;
		dayOfMonth[10] = 29;
		dayOfMonth[11] = 30;
		dayOfMonth[12] = 31;

		System.out.println("Please enter the number of month to find out its amount of days.");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < dayOfMonth.length; i++) {
			if (n == i) {
				System.out.println("The " + n + " month of 2017 year has " + dayOfMonth[i] + " days.");
			}

		}

	}
}

