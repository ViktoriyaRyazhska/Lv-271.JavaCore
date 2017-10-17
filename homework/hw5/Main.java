package homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Month month = new Month();
		month.enterTheNumber(br);
		Integers numb = new Integers();
		numb.inputIntegers(br, numb.getArray10());
		numb.sumOrProduct(numb.getArray10());
		numb.inputIntegers(br, numb.getArray5());
		numb.minimumAndPos(numb.getArray5());
		numb.inputTillNeg(br);
		Car car = new Car("Audi", 2012, 2.8);
		Car car1 = new Car("Ford", 1994, 1.2);
		Car car2 = new Car("Mersedes", 2009, 1.4);
		Car car3 = new Car("BMW", 2014, 4.0);
		Car[] cars = {car, car1, car2, car3};
		car.certainYear(br, cars);
		car.sortingYear(cars);
	}
}
