package PracticalWork.L8;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserName {

	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void getingUser(BufferedReader reader) throws IOException {
		System.out.println("Please enter your user name fom 3 to 15 symbols.");
		user = reader.readLine();
	}

	public boolean checkUserName(String user) {
		Pattern p = Pattern.compile("[a-zA-Z_0-9]+{3,15}");
		Matcher m = p.matcher(user);
		return m.matches();
	}

	public void output() {
		if (this.checkUserName(user)) {
			System.out.println("User name is correct.");
		} else {
			System.out.println("User name incorrect.");
		}
	}

	public static void main(String[] args) {

	}

}

//
// The user name can be 3 to 15 characters of the Latin alphabet, numbers, and
// underscores.
// Using regular expressions implement checking the user name for validity.
// Input five names in the main method .
// Output a message to the console of the validation of each of the entered
// names