package edu.com;
import java.io.IOException;
import java.util.Scanner;
public class SoftHome3 {
    public static void main(String[] args)throws IOException {
        Scanner br=new Scanner(System.in);

        System.out.println("Введіть ціну за хвилину для c1");
        double c1=br.nextDouble();
        System.out.println("Ви ввели для c1="+c1);
        System.out.println("Введіть ціну за хвилину для c2");
        double c2=br.nextDouble();
        System.out.println("Ви ввели для c2="+c2);
        System.out.println("Введіть ціну за хвилину для c3");
        double c3=br.nextDouble();
        System.out.println("Ви ввели для c3="+c3);

        System.out.println("Скільки тривала перша розмова?");
        double t1=br.nextDouble();
        System.out.println("Ви ввели t1="+t1);
        System.out.println("Скільки тривала друга розмова?");
        double t2=br.nextDouble();
        System.out.println("Ви ввели t2="+t2);
        System.out.println("Скільки тривала третя розмова?");
        double t3=br.nextDouble();
        System.out.println("Ви ввели t3="+t3);

        System.out.println("Ціна за дзвінок в країну c1 тривалістю t1 рівна "+(c1*t1));
        System.out.println("Ціна за дзвінок в країну c1 тривалістю t2 рівна "+(c1*t2));
        System.out.println("Ціна за дзвінок в країну c1 тривалістю t3 рівна "+(c1*t3));
        System.out.println("Разом це буде коштувати= "+(c1*t1+c1*t2+c1*t3));

        System.out.println("Ціна за дзвінок в країну c2 тривалістю t1 рівна "+(c2*t1));
        System.out.println("Ціна за дзвінок в країну c2 тривалістю t2 рівна "+(c2*t2));
        System.out.println("Ціна за дзвінок в країну c2 тривалістю t3 рівна "+(c2*t3));
        System.out.println("Разом це буде коштувати= "+(c2*t1+c2*t2+c2*t3));

        System.out.println("Ціна за дзвінок в країну c3 тривалістю t1 рівна "+(c3*t1));
        System.out.println("Ціна за дзвінок в країну c3 тривалістю t2 рівна "+(c3*t2));
        System.out.println("Ціна за дзвінок в країну c3 тривалістю t3 рівна "+(c3*t3));
        System.out.println("Разом це буде коштувати= "+(c3*t1+c3*t2+c3*t3));

    }
}