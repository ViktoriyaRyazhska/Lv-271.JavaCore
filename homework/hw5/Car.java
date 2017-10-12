package homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {

	private String type;
	private int year;
	private double engCap;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngCap() {
		return engCap;
	}

	public void setEngCap(double engCap) {
		this.engCap = engCap;
	}

	public Car(String type, int year, double engCap) {
		this.type = type;
		this.year = year;
		this.engCap = engCap;
	}

	public Car() {
	}

	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engCap=" + engCap + "]";
	}

	public void certainYear(BufferedReader rd, Car... car) throws NumberFormatException, IOException {
		System.out.println("Enter the year: ");
		int year = Integer.parseInt(rd.readLine());
		int check=0;
		for (Car cars : car) {
			if (cars.getYear() == year) {
				System.out.println("The model is: " + cars.getType());
				check++;
			}
			
		}
		if(check==0){
			System.out.println("There is no model of this year");
		}
	}
	public void sortingYear(Car[] cars) {
		int temp;
		System.out.println("Descending year:");
		for( int i = 0; i < cars.length; i++){
			for( int j = i+1; j<cars.length; j++){
				if(cars[i].getYear()< cars[j].getYear()){
				temp = cars[i].getYear();
				cars[i].setYear(cars[j].getYear());
				cars[j].setYear(temp);
				}
			}
		}
		for(int i = 0; i< cars.length; i++){
		System.out.println(cars[i]);
		}
	}
}
