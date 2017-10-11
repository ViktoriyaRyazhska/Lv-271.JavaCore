package HW5;

import java.util.Scanner;

public class SoftHome54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array=new int[5];

         for(int i=0;i<array.length; i++){
             array[i] = sc.nextInt();
             if(array[i]<0){
                 break;
             }
        }
        int product = 1;
        for (int i = 0; i < 5; i++) {
            if (array[i] > 0) {
                product = product * array[i];
            }
        }
        System.out.println("Product = " + product);

    }
}
