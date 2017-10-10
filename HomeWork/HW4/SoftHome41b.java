import java.util.Scanner;

public class SoftHome41b {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Введіть перше число");
        int a=sc.nextInt();

        System.out.println("Введіть друге число");
        int b=sc.nextInt();

        System.out.println("Введіть третє число");
        int c=sc.nextInt();

        int max=a;
        int min=a;

        if(a<b){
            max=b;
        }
        else {
            min=b;
        }
        if(c>max){
            max=c;
        }
        else {
                if(c<min){
                    min=c;
                }
        }

        System.out.println("Найбільше число="+max+" ,а найменше="+min);
    }
}
