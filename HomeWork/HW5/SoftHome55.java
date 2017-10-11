package HW5;

import java.util.Scanner;

public class SoftHome55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Car cr = new Car("Mazda",1997,"1000cc");
        Car cr1 = new Car("Honda",1998,"900cc");
        Car cr2= new Car("BMW",1999,"800cc");
        Car cr3 = new Car("Chevrolet",2000,"2500cc");


        System.out.println("Input year of car");
        int inputYear=sc.nextInt();

        if(inputYear==cr.getYear()){
            System.out.println(cr);
        }
        if(inputYear==cr1.getYear()){
            System.out.println(cr1);
        }
        if(inputYear==cr2.getYear()){
            System.out.println(cr2);
        }
        if(inputYear==cr3.getYear()){
            System.out.println(cr3);
        }

        int[] years=new int[4];

        years[0]=cr.getYear();
        years[1]=cr1.getYear();
        years[2]=cr2.getYear();
        years[3]=cr3.getYear();

        int tmp;
        for (int i = 0; i < years.length - 1; i++) {
            for (int j = i + 1; j < years.length; j++) {
                if (years[i] < years[j]) {
                    tmp = years[i];
                    years[i] = years[j];
                    years[j] = tmp;
                }
            }
        }
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }

    }
}
