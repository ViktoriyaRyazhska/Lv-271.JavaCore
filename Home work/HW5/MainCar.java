package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainCar {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	Car[] car=new Car[5];
	car[0]=new Car("Mersedes", 1980, 300);
	car[1]=new Car("BMW", 1995, 500);
	car[2]=new Car("Maserati", 2015, 600);
	car[3]=new Car("Toyota", 1995, 250);
	car[4]=new Car("BMW", 2015, 400);
	System.out.println("Enter yearCar:");
	int year=Integer.parseInt(br.readLine());
	Car.getCarByYear(car, year);
	Car.getCarByOrderYear(car);
	
	
	}

}
