package homework5;

import java.util.Scanner;

public class AppCars {

	public static void main(String[] args) {
		Car[] car = new Car [4];
		car[0] = new Car("Audi", 2008, 2.0);
		car[1] = new Car("Kia", 2014, 1.6);
		car[2] = new Car("Hyundai", 2012, 1.4);
		car[3] = new Car("BMW", 2008, 2.0);
		System.out.println("Enter year of car production");
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		for (int i = 0; i < car.length; i++) {
			if (car[i].getYear()==y) {
				car[i].output();
			}
		}
			
			Car tmp = new Car ();
			for (int i = 0; i < car.length - 1; i++) {
			for (int j = i + 1; j < car.length; j++) {
				if (car[i].getYear()<car[j].getYear()) {
					tmp = car[i];
					car[i] = car[j];
					car[j] = tmp;
				 	}
				}
			}
			for (int i = 0; i < car.length; i++) {
						car[i].output();
					}
		
	
	}

}
