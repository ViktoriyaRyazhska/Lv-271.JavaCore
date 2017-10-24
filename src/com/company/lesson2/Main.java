package com.company.lesson2;


/*
Flower bed is shaped like a circle.
Calculate the perimeter and area by entering the radius.
Output obtained results.

Define String variables name and address.
Output question "What is your name?"
Read the value name and output next question: “Where are you live, (name)?".
Read address and write whole information.

Phone calls from three different countries are с1, с2 and с3 standard units per minute.
 Talks continued t1, t2 and t3 minutes.
 How much computer will count for each call separately and all talk together?
 Input all source data from console, make calculations and output to the screen.


 */

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        callCalculator();

    }

    //task 1
    public static void radiusFlower(){

        System.out.print("Enter you radius: ");
        double radius = scanner.nextDouble();
        double area = Math.PI + (radius * radius);
        double perimeter = Math.PI * 2 * radius;

        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + perimeter);
    }


    //task 2
    public static void homeName(){
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println("Where do you live, " + name + " ?");
        String address = scanner.next();
        System.out.println("Hello, " + name + " your live here: " +address);
    }


    //task 3
    public static void callCalculator(){
        System.out.println("Enter first country call price:");
        BigDecimal c1 = scanner.nextBigDecimal();
        System.out.println("Enter second country call price:");
        BigDecimal c2 = scanner.nextBigDecimal();
        System.out.println("Enter third country call price:");
        BigDecimal c3 = scanner.nextBigDecimal();

        System.out.println("Enter first country call duration:");
        int t1 = scanner.nextInt();
        System.out.println("Enter second country call duration:");
        int t2 = scanner.nextInt();
        System.out.println("Enter third country call duration:");
        int t3 = scanner.nextInt();

        System.out.println("Price for 1st call: " + calculateCost(t1, c1));
        System.out.println("Price for 2nd call: " + calculateCost(t2, c2));
        System.out.println("Price for 3rd call: " + calculateCost(t3, c3));

        BigDecimal result = new BigDecimal(0);
        result = result.add((calculateCost(t1, c1))
                .add(calculateCost(t2, c2))
                .add(calculateCost(t3, c3)));

        System.out.println("Total price: " +  result);

    }

    public static BigDecimal calculateCost(int time,BigDecimal price)
    {
        BigDecimal   cost = price.multiply(new BigDecimal(time));
        return cost;
    }

}
