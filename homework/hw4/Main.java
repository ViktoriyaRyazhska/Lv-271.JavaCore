package homework.hw4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 3 float numbers: ");
		float n1 = Float.parseFloat(br.readLine());
		float n2 = Float.parseFloat(br.readLine());
		float n3 = Float.parseFloat(br.readLine());
		System.out.println("Do the numbers belong to the range [-5;5]? "
				+ ((n1 >= -5 && n1 <= 5) && (n2 >= -5 && n2 <= 5) && (n3 >= -5 && n3 <= 5)));
		System.out.println("Enter 3 integer numbers: ");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		int num3 = Integer.parseInt(br.readLine());
		int max;
		int min;
		max = num1;
		min = num1;
		if (num2 > num1) {
			max = num2;
		} else {
			if (num3 > num1) {
				max = num3;
				min = num2;
			} else {
				min = num3;
			}
		}
		if (num3 > num2) {
			max = num3;
		}
		System.out.println("Max is " + max);
		System.out.println("Min is " + min);
		HTTPErrors error = new HTTPErrors();
		System.out.println("Enter the number of HTTP error: ");
		error.setErrorNumber(Integer.parseInt(br.readLine()));
		error.errorList();
		Dog dog = new Dog();
		Dog dog1 = new Dog("Jessi", "Layka", 7);
		Dog dog2 = new Dog("Barni", "Malamyt", 4);
		dog.setName("Graf");
		dog.setBreed("Bulldog");
		dog.setAge(2);
		Dog.sameName(dog, dog1, dog2);
		Dog.theOldestDog(dog, dog1, dog2);
		
	}
}
