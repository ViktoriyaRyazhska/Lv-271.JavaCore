package homework8;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentences = sc.nextLine();
		String[] s = sentences.split(" ");
		String tm = "";
		for(int i = 0; i<s.length; i++) {
			if(tm.length()<s[i].length()) {
				tm=s[i];
			}
		}
		System.out.println("the longest word is " + tm);
		System.out.println("the longest word has " + tm.length() + " letters");
		
		StringBuffer buffer = new StringBuffer(s[1]).reverse();
		System.out.println(buffer);
		sc.close();
	}

}
