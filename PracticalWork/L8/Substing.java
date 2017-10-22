package PracticalWork.L8;

public class Substing {

	public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Bye World";

		String n1 = s1.substring(6);
		String n2 = s2.substring(4);

		if (n1.equals(n2)) {
			System.out.println("The first variable substring second.");
		} else {
			System.out.println("The first variable don`t substring second.");
		}

	}

}
