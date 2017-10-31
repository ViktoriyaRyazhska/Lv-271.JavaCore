package homework.hw8.Task1_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		Words sent = new Words("I      enjoy    to     learn            JAVA                    programming");
	//	sent.setSentence(br.readLine());
		sent.convertSentence(sent);
		System.out.println("Converted sent is: " + sent.getSentence());
		sent.getLongestWord(sent);
		sent.secondWordRevers(sent);

	}
}

