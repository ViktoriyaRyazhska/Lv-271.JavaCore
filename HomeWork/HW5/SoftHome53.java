package HW5;

import java.util.Scanner;

public class SoftHome53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array=new int[5];

        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt();
        }

        int count=0;
        int pos=0;
        for(int i=0;i<array.length;i++){
            if(array[i]>0){
                count++;
            }
            if(count==2){
                pos=i;
                break;
            }
        }

            int min = array[0];
            int imin = 0;
            int i = 0;
            while (i < array.length) {
                if (array[i] < min) {
                    min = array[i];
                    imin = i;
                }
                i++;
            }
            System.out.println("Position of second positive number is "+(pos+1));
            System.out.print("Minimum = " + min);
            System.out.println(" is in " + (imin + 1) + " place");
        }
}
