package com.company.lesson5;

import java.util.Calendar;

public class Main {
    public static void main(String[] Args){



        //task1
        First task1 = new First();
        task1.getUserNumber();
        task1.monthHaveDays();

        //task2
        Second second = new Second();
        second.fillArray();
        second.calculate();

        //task3
        Third task3 = new Third();
        task3.enterNumbers();
        task3.positionNumberOfSecondPositive();
        task3.minimumPosition();

        //task4
        Fourth task4 = new Fourth();
        task4.countEven();

/*
Create and initialize four instances of class Car. Display cars
certain model year  (enter year in the console);
ordered by the field year.

 */
        //task5


        CarUsage task5 = new CarUsage();
        task5.getCarsByYear();





    }
}
