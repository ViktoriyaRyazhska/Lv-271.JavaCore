package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalSum {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter 10 integer numbers.");
		int[] num = new int[10];
		for (int i=0; i<num.length; i++)
		{int n = Integer.parseInt(reader.readLine());
			num[i] = n;
		}
		int m = 0;
		int x=1;
		for (int i=0; i<num.length; i++)
		{
			if ((i>=0)&&(i<5)&&(num[i]>0))
			{
				m += num[i];
				continue;
			} else if
			((i>=5)&&(i<=10)&&(num[i]>0)) {
			x *= num[i];
			continue;
			}
		}
		
		System.out.println("The result of sum is number " + m);
		System.out.println("The result of product is number " + x);
	}

}