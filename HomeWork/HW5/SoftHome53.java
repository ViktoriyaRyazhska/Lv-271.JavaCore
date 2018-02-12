package HW5;

import java.util.Scanner;

public class Home02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[]=new int[5];
       int counter=0;
       int min=arr[0];
       int imin=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Plz input number");
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                counter++;
            }
            if(counter==2){
                System.out.println("Second positive number is "+arr[i]+" and his index is "+i);
            }
            if(min>arr[i]){
                min=arr[i];
                imin=i;
            }
        }
        System.out.println("Min="+min+"and his pisition is "+imin);
    }
}
