import java.util.Scanner;

public class SoftHome4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть перше число");
        float a = sc.nextFloat();
        System.out.println("Введіть друге число");
        float b = sc.nextFloat();
        System.out.println("Введіть третє число");
        float c = sc.nextFloat();

        System.out.println("a=" + a + ",b=" + b + ",c=" + c);

        if ((a >= -5) && (a <= 5)) {
            System.out.println("Число а попало в проміжок[-5;5]");
        }
        else{
            System.out.println("Число а не попадає в проміжок[-5;5]");
        }

        if ((b >= -5) && (b <= 5)) {
            System.out.println("Число b попало в проміжок[-5;5]");
        }
        else{
            System.out.println("Число b не попадає в проміжок[-5;5]");
        }

        if ((c >= -5) && (c <= 5)) {
            System.out.println("Число c попало в проміжок[-5;5]");
        }
        else{
            System.out.println("Число c не попадає в проміжок[-5;5]");
        }
    }
}
