package HomeWork;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunBigNum {

	public static void main(String[] args) throws IOException {

		BigNum num = new BigNum();
		System.out.println("Please enter 3 Integer numbers....");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		num.a = Integer.parseInt(reader.readLine());
		num.b = Integer.parseInt(reader.readLine());
		num.c = Integer.parseInt(reader.readLine());

		num.max(num.a, num.b, num.c);
		num.min(num.a, num.b, num.c);
		num.output();
	}
}
