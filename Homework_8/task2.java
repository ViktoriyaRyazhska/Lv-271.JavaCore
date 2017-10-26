package homework8;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentences = sc.nextLine();
		if(sentences.contains(" ")) {
			sentences = sentences.replace("  ", " ");
		}
		System.out.println(sentences);
		sc.close();
	}

}
