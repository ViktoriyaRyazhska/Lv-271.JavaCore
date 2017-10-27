package homework.hw8.Task3;

import java.util.regex.*;

public class Main {
	public static void main(String[] args) {

		String pattern = "\\$([0-9]*)\\.[0-9]{2}";
		String text = "$235454.54";

		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);

		if (m.matches()) {
			System.out.println("Matches the entire text string");
			m.reset();
			while (m.find()) {
				System.out.print(text.substring(m.start(), m.end()) + "*");
			}
		}else
			System.out.println("Not match");
		

	}
}