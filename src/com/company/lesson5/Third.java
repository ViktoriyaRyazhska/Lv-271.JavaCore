package com.company.lesson5;

import java.util.Scanner;

public class Third {
    /*
    Enter 5 integer numbers.
    Find position of second positive number;
    minimum and its position in the array.

     */
    private int arr[] = new int[5];
    Scanner scanner;

    public void enterNumbers() {
        scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
                System.out.print("Please enter " + (i + 1) + "/"+(arr.length)+" number:");
                if (scanner.hasNextInt()) {
                    arr[i] = scanner.nextInt(); }
                else {
                    System.out.println("It is not an integer. Please try again");
                    scanner.next();
                    i--;
            }
        }
        scanner.close();
    }


    public void positionNumberOfSecondPositive(){
        int positiveCount = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>0){
                if (++positiveCount == 2){
                    System.out.println("Array position of second positive number is: " + i + " and value is: " + arr[i]);
                    break;
                }
            }
        }
        if (positiveCount < 2){
            System.out.println("There is no 2 positive numbers");
        }

    }

    public void minimumPosition(){
        int min = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[min]>arr[i]){
                    min = i;
            }
        }
        System.out.println("Array position of minimum value number is: "+ min +" and value is " + arr[min]);
    }

}
