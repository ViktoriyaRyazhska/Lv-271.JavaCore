package com.company.lesson5;

import java.util.Scanner;

public class CarUsage {

    Car car1 = new Car("type1", 2000, 120);
    Car car2 = new Car("type3", 2002, 80);
    Car car3 = new Car("type2", 1980, 200);
    Car car4 = new Car("type1", 2004, 70);
    Car[] cars = {car1, car2, car3, car4};
    Scanner scanner = new Scanner(System.in);

    public void getCarsByYear() {
        System.out.print("Enter the year:");
        while (!scanner.hasNextInt()) {
            System.out.println("Incorrect value. Please enter a number:");
            scanner.next();
        }
        int year = scanner.nextInt();
        scanner.close();
        System.out.println("All cars:");
        printAllCars();
        System.out.println("\nSorted cars:");
        orderCars(cars);
        printAllCars();
        System.out.println("\nYou chosed cars:");
        printCarsOfYear(cars, year);

    }

    public void orderCars(Car[] car) {
        Car storage;
        for (int i = 0; i < car.length-1; i++) {
            for( int j = i + 1; j < cars.length; j++) {
                if (car[i].getProductionYear() > car[j].getProductionYear()) {
                    storage = car[i];
                    car[i] = car[j];
                    car[j] = storage;
                }
            }
        }
    }

    private void printCarsOfYear(Car[] cars, int year) {
        int counter = 0;
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getProductionYear() == year) {
                System.out.println(cars[i].toString());
                counter++;
            }
        }
        if (counter==0){
            System.out.println("There is no  such car");
        }
    }

    public void printAllCars() {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }
}
