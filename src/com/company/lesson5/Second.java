package com.company.lesson5;

import java.lang.reflect.Array;
import java.util.Random;

public class Second {
    /*
    Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
     */

    private int[] arrOfInt = new int[10];

    public void fillArray(){
        Random rnd = new Random();
        for (int i=0; i<arrOfInt.length; i++){
            arrOfInt[i] = rnd.nextInt(200) - 100;
            System.out.print( arrOfInt[i] + " ");
        }}


    public void calculate(){
        long sum = 0;
        if (firstFivePositive()){
            int i = 0;
            while(i<5){
                sum += arrOfInt[i];
                i++;
            }
            System.out.println("\nSum of first 5 numbers is: " + sum);
        }
        else{
            int i = 5;
            sum = 1;
            while( i < arrOfInt.length){
                sum *= arrOfInt[i];
                i++;
            }
            System.out.println("\nMultiplication result of second 5 numbers is: " + sum);
        }
    }

    private boolean firstFivePositive(){
        for (int i=0;i<5;i++){
            if (arrOfInt[i]<0){
                return false;
            }
        }
        return true;
    }
}
