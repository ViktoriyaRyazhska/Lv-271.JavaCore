package HW5;

import java.util.Scanner;

public class Home02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int inputYear=sc.nextInt();
        Car car1=new Car(2015,"250km");
        Car car2=new Car(2013,"150km");
        Car car3=new Car(2012,"100km");
        Car car4=new Car(2010,"300km");

        if(inputYear==car1.getYearOfProduction()){
            System.out.println(car1);
        }
        if(inputYear==car2.getYearOfProduction()){
            System.out.println(car2);
        }
        if(inputYear==car3.getYearOfProduction()){
            System.out.println(car3);
        }
        if(inputYear==car4.getYearOfProduction()){
            System.out.println(car4);
        }
        int years[]=new int[4];

        years[0]=car1.getYearOfProduction();
        years[1]=car2.getYearOfProduction();
        years[2]=car3.getYearOfProduction();
        years[3]=car4.getYearOfProduction();

        int temp;
        for(int i=0;i<(years.length-1);i++){
                if(years[i]<years[i+1]){
                    temp=years[i];
                    years[i]=years[i+1];
                    years[i+1]=temp;
            }

        }
        for (int i = 0; i < years.length; i++) {
            System.out.println(years[i]);
        }
    }
}
