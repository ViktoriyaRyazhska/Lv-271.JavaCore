package HomeWork.L8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneSpace {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a sentence that contains the words between more than one space.");

		String s = reader.readLine();
		String n = null;
		if (s.contains("  ")) {
			n = s.replace("  ", " ");
		}

		System.out.println(n);
	}
}
