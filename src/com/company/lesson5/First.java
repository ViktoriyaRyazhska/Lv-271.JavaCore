package com.company.lesson5;


/*
Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month).
 */

import java.util.Scanner;

public class First {

    private int[] daysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private int monthNumber;

    public void getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please number of your month (1-12):");

        try{
            this.monthNumber = scanner.nextInt();
        }
        catch  (java.util.InputMismatchException e){
            System.out.println("User entered not an integer value");
            monthNumber = -1;
        }
    }

    public void monthHaveDays() {

        if ((1 <= this.monthNumber) && (this.monthNumber <= 12)) {
            System.out.println("Your month has " + daysOfMonth[monthNumber-1] + "days");
        }
        else {
            System.out.println("There is no such month number");
        }
    }
}