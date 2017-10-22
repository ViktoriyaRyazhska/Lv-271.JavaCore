package PracticalWork.L8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainUserName {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		UserName user = new UserName();

		user.getingUser(reader);
		user.output();

	}

}
