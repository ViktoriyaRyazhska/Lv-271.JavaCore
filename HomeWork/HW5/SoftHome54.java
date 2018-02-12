package HW5;

import java.util.Scanner;

public class Home02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        int product=1;
        for(int i:arr){
            arr[i]=sc.nextInt();
            if(arr[i]<0){
                break;
            }
            if(arr[i]%2==0){
                product*=arr[i];
            }
        }
        System.out.println("Product="+product);
    }
}

