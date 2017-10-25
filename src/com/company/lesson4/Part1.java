package com.company.lesson4;



import java.util.Scanner;

public class Part1 {

    Scanner scanner;

    public Part1(Scanner scanner){
        this.scanner = scanner;
    }

    public float readFloat() {
        System.out.print("Please enter your number:");
        if (scanner.hasNextFloat()) {
            return scanner.nextFloat();
        }
        return Float.parseFloat(null);
    }

    public int readInt(){
        System.out.print("Please enter your number:");
        if (scanner.hasNextInt()){
            return scanner.nextInt();
        }
        return Integer.parseInt(null);

    }
    public boolean belongsToRange(float number){
        if ((-5 <= number) && (number <= 5)){
            return true;
        }
        return false;
    }

    public int returnMax(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b; }
        if (c > max){
            max = c;}
        return max;
    }

    public int returnMin (int a, int b, int c){
        int min = a;
        if (b < min){
            min = b; }
        if (c < min){
            min = c;}
        return min;
    }













}
