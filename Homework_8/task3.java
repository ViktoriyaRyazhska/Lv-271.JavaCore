package homework8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter text");
		String sentences = sc.nextLine();
		Pattern p = Pattern.compile("(\\$[0-9]*)(\\.[0-9]{2})");
		Matcher m = p.matcher(sentences);
		while (m.find()) {
			System.out.println(sentences.substring(m.start(), m.end()) + " ");
		}
		sc.close();
	}

}
