package edo.com;
import java.io.IOException;
import java.util.Scanner;

public class SoftHome1 {
    public static void main(String[] args)throws IOException{
        Scanner br=new Scanner(System.in);
        System.out.println("Введіть радіус кола");
        double radius =br.nextDouble();
        System.out.println("Ви ввели "+radius);
        double perimeter=2*3.14*radius;
        System.out.println("Периметр кола рівний= "+perimeter);
    }
}