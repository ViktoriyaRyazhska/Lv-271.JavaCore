package SoftHW5;

import java.util.Scanner;

public class SoftHome52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cheack=false;

        int[] array = new int[10];

       for(int i:arr){
            System.out.println("Plz input number");
            arr[i]=sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                    sum += array[i];
                    System.out.println("sum= " + sum);
            }


            else {
                int product = 1;
                for (int j = 5; j < array.length; j++) {
                        product *= array[j];
                }
                System.out.println("Product= "+product);
                break;
            }
        }
    }
}
