package HW5;

import java.util.Scanner;

public class SoftHome51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("В "+num +" місяці,є "+months[1]+"днів");
                break;
            case 2:
                System.out.println("В "+num +" місяці,є "+months[2]+"днів");
                break;
            case 3:
                System.out.println("В "+num +" місяці,є "+months[3]+"днів");
                break;
            case 4:
                System.out.println("В "+num +" місяці,є "+months[4]+"днів");
                break;
            case 5:
                System.out.println("В "+num +" місяці,є "+months[5]+"днів");
                break;
            case 6:
                System.out.println("В "+num +" місяці,є "+months[6]+"днів");
                break;
            case 7:
                System.out.println("В "+num +" місяці,є "+months[7]+"днів");
                break;
            case 8:
                System.out.println("В "+num +" місяці,є "+months[8]+"днів");
                break;
            case 9:
                System.out.println("В "+num +" місяці,є "+months[9]+"днів");
                break;
            case 10:
                System.out.println("В "+num +" місяці,є "+months[10]+"днів");
                break;
            case 11:
                System.out.println("В "+num +" місяці,є "+months[11]+"днів");
                break;
            case 12:
                System.out.println("В "+num +" місяці,є "+months[12]+"днів");
                break;
            default:
                System.out.println("Wrong number");
                break;
        }
    }
}
