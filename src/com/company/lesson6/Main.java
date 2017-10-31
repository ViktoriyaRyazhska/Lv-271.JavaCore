package com.company.lesson6;

import com.company.lesson6.Empl.ContractEmployee;
import com.company.lesson6.Empl.Employee;
import com.company.lesson6.Empl.SalariedEmployee;
import com.company.lesson6.FlyingObjects.*;

public class Main {
    public static void main(String[] Args){


        /*
        Bird[] allbirds = new Bird[4];
        allbirds[0] = new Chicken("noFeathers", "not yet");
        allbirds[1] = new Eagle("large feathers", "yes");
        allbirds[2] = new Pinguin("maybe has feathers", "yes");
        allbirds[3] = new Swallow("usial feathers", "yes");

        for (int i = 0; i<allbirds.length; i++) {
            allbirds[i].whoAmI();
            allbirds[i].fly();
            System.out.println(allbirds[i].toString() + "\n\n\n");
        }
*/
    //EMPLOOEE
        System.out.println("ss");

        Employee[] employee = new Employee[4];
        employee[0] = new ContractEmployee(3658742, 254,  32, "Vasya", "contract01");
        employee[1] = new ContractEmployee(4225782, 254,  45,"Ira", "contract02");;
        employee[2] = new SalariedEmployee(2568521, 3000, "Olesia", "salary01");
        employee[3] = new SalariedEmployee(3520486, 523, "Kolya", "salary02");


        for (int i = 0; employee.length > i; i++){
            System.out.println(employee[i].toString());
        }

        Employee temp = new Employee();

        for (int i = 0; i < employee.length - 1; i++) {
            for (int j = i + 1; j < employee.length; j++) {
                if (employee[i].calculatePay() < employee[j].calculatePay()) {
                    temp = employee[i];
                    employee[i] = employee[j];
                    employee[j] = temp;
                }
            }
        }



        for (int i = 0; employee.length < i; i++){
            System.out.println(employee[i].toString());
        }





    }
}
