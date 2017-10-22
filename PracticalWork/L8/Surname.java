package PracticalWork.L8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Surname {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int x = 0;
		int x1 = 0;
		String surname;
		String name;
		String patronymic;
		String fullName;
		
		System.out.println("Please enter your surname, name and patronymic in this order.");

		fullName = reader.readLine();

		x = fullName.indexOf(" ");
		x1 = fullName.lastIndexOf(" ");

		surname = fullName.substring(0, x);

		name = fullName.substring(x, x1);
		String name1 = name.trim();

		patronymic = fullName.substring(x1);
		String patronymic1 = patronymic.trim();

		System.out.println("Your surname and initials: " + surname + " " + name1.charAt(0) + "." + patronymic1.charAt(0) + ".");
		System.out.println("Your name: " + name + ".");
		System.out.println("Your name, middle name and last name: " + name + " " + patronymic1 + " " + surname + ".");

	}

}
