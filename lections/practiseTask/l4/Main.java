package PractiseTask.l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		Odd odInt = new Odd();
		odInt.printOdd(-75, 136, 137, -2, -5, 67, -54, -55, -89, 169);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DayOfWeek dw = new DayOfWeek();
		DayOfWeek dw1 = new DayOfWeek(6);
		System.out.println("Please, enter the number of the day: ");
		dw.setDayNumber(Integer.parseInt(br.readLine()));
		dw.printDay();
		if (dw.getDayNumber() != 6 && dw.getDayNumber() >= 1 && dw.getDayNumber() <= 7) {
			System.out.println("It's a bad day, better when ");
			dw1.printDay();
		} else if (dw.getDayNumber() >= 1 && dw.getDayNumber() <= 7)
			System.out.println("Great choice");
		Continents cnt = new Continents();
		Continents cnt1 = new Continents("happypenguins");
		Continents cnt2 = new Continents();
		cnt.setCountry("Ukraine");
		cnt2.setCountry("Narnia");
		cnt.getContinent();
		cnt1.getContinent();
		cnt2.getContinent();
		Product pdct = new Product();
		Product pdct1 = new Product("Coca-cola");
		Product pdct2 = new Product(20.54);
		Product pdct3 = new Product("Lion", 8.99, 150);
		pdct.setName("Lays");
		pdct.setPrice(15.99);
		pdct.setQuantity(240);
		pdct1.setPrice(18.50);
		pdct1.setQuantity(120);
		pdct2.setName("Sandora");
		pdct2.setQuantity(100);
		Product.theMostExpensive(pdct, pdct1, pdct2, pdct3);
		Product.theBiggestQuantity(pdct, pdct1, pdct2, pdct3);
		}
	
	}
