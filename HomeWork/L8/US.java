package HomeWork.L8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class US {
	String s;

	public void getingUs(BufferedReader reader) throws IOException {
		System.out.println("Please enter symbols.");
		s = reader.readLine();
	}

	public boolean checkP(String s) {
		Pattern p = Pattern.compile("(\\$[0-9]*)(\\.[0-9]{2})");
		Matcher m = p.matcher(s);
		return m.matches();
	}

	public void output() {
		if (this.checkP(s)) {
			System.out.println("The occurrence of US currency " + s + " is match.");
		} else {
			System.out.println("The occurrence of US currency " + s + " isn`t match.");
		}
	}

	public static void main(String[] args) throws IOException {
		US pat = new US();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		pat.getingUs(reader);
		pat.output();

	}

}

// Implement a pattern for US currency:
// the first symbol "$", then any number of digits,
// dot and two digits after the dot. Enter the text from the console that
// contains several occurrences of US currency.
// Display all occurrences on the screen.
