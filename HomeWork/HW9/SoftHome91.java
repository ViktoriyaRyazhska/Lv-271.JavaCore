import java.util.Scanner;

public class SoftHome91 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b");
        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            if(b==0){
                System.out.println("Sorry,b=0");
                System.exit(1);
            }
            double dv=div(a,b);
            System.out.println(dv);
        }
        catch (java.util.InputMismatchException e) {
            System.out.println("I want double!");
            sc.nextLine();
        }
        catch (Exception allAnotherExceptions) {
            System.out.println("Error!");
        }
       finally {
            System.out.println("Program is working");
        }
    }

    public static double div(double a, double b){
       return a/b;
    }

}
