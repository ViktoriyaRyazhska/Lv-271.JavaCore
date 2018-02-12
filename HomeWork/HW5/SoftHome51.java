package HW5;

import java.util.Scanner;

public class Home02 {
   static int arr[]={31,29,31,30,31,30,31,31,30,31,30,31};
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Plz input number of mounth");
            int number=sc.nextInt();
            System.out.println("You input "+number);
            System.out.println("Number of days in "+number+" mounth,is "+arr[number-1]);

    }
}
