package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MainCar {

	public static void main(String[] args) throws IOException {
		Car[] car = new Car[4];
		car[0] = new Car("KIA", 2008, 194);
		car[1] = new Car("BMW", 2012, 205);
		car[2] = new Car("Ford", 2010, 150);
		car[3] = new Car("Mazda", 2017, 205);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter year of production of the car");
		int n = Integer.parseInt(reader.readLine());
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYearProd() == n) {
				System.out.print(car[i].getType() + " ");
				
			}
		}
		System.out.println("is(are) the car(s) of the " + n + " year production.");
		System.out.println();

		Car tmp = new Car();
		for (int i = 0; i < car.length - 1; i++) {
			for (int x = i + 1; x < car.length; x++) {
				if (car[i].getYearProd() > car[x].getYearProd()) {
					tmp = car[i];
					car[i] = car[x];
					car[x] = tmp;
				}
			}
		}

		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]);
		}
	}
}
