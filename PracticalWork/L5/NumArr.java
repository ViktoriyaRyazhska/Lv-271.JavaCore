package L5;

import java.io.BufferedReader;
import java.io.IOException;

public class NumArr {
	private int x = 0;
	private int c = 0;

	private int[] num = new int[10];

	public int[] getNum() {
		return num;
	}

	public void setNum(int[] num) {
		this.num = num;
	}

	public void inpunInteger(BufferedReader reader) throws IOException {
		System.out.println("Please enter 10 Integer numbers....");
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(reader.readLine());
		}
	}

	public void bigNum(int[] num) {
		int m = num[0];
		for (int i = 1; i < num.length; i++) {
			if (m < num[i]) {
				m = num[i];
			}
		}
		System.out.println("The biggest number is: " + m + ".");
	}

	public void sumPosNum(int num[]) {
		int n = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] >= 0) {
				n += num[i];
				continue;
			}
		}
		System.out.println("The sum of positive numbers is: " + n + ".");
	}

	public void amNegNum(int num[]) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] < 0)
				x++;
		}
		System.out.println("The amout of negative numbers in the array is: " + x + ".");
	}

	public void amPosVal(int num[]) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] > 0)
				c++;
		}
	}

	public void posNegVal() {
		if (c > x) {
			System.out.println("There are more positive values in array.");
		} else {
			System.out.println("There are more negative values in array.");
		}
	}
}
