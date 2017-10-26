package com.company.lesson5;

import java.util.Scanner;

public class Fourth {

    /*
    Organize entering integers until the first negative number. Count the product of all entered even numbers.
     */

    Scanner scanner = new Scanner(System.in);

    private int enterNumbers() {

            System.out.print("Please enter your number, to exit, enter negative:");
            while (!scanner.hasNextInt()){
                System.out.println("It is not an integer. Please re-enter:");
                scanner.next();
            }
        return scanner.nextInt();
    }

    public void countEven(){
        int even = 0;
        int number = enterNumbers();
        while(number>=0){
            if (number % 2 == 0) {
                even++;
            }
            number = enterNumbers();
        }
        System.out.println("Amount of even numbers entered:" + even);
    }

}
