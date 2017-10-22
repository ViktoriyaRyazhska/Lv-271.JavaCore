import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftHome83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myLine = sc.nextLine();
        String myLine2 = sc.nextLine();
        String myLine3 = sc.nextLine();
        Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
        Matcher m = p.matcher(myLine);
        Matcher m2 = p.matcher(myLine2);
        Matcher m3 = p.matcher(myLine3);

        while (m.find()) {
            System.out.print(myLine.substring(m.start(), m.end()) + "\t");
        }
        while (m2.find()) {
            System.out.print(myLine2.substring(m2.start(), m2.end()) + "\t");
        }
        while (m3.find()) {
            System.out.print(myLine3.substring(m3.start(), m3.end()));
        }
        if(m.matches()==true){
            System.out.println("\n1 Рядок  відповідає всьому шаблону");
        }
        else {
            System.out.println("\n1 Рядок не  відповідає всьому шаблону");
        }
        if(m2.matches()==true){
            System.out.println("2 Рядок відповідає всьому шаблону");
        }
        else {
            System.out.println("2 Рядок не відповідає всьому шаблону");
        }
        if(m3.matches()==true){
            System.out.println("3 Рядок відповідає всьому шаблону");
        }
        else {
            System.out.println("3 Рядок не відповідає всьому шаблону");
        }
        if(m.lookingAt()==true){
            System.out.println("Шаблон співпадає з початком 1 текстового рядка");
        }
        else {
            System.out.println("Шаблон не співпадає з початком 1 текстового рядка");
        }
        if(m2.lookingAt()==true){
            System.out.println("Шаблон співпадає з початком 2 текстового рядка");
        }
        else {
            System.out.println("Шаблон не співпадає з початком 2 текстового рядка");
        }
        if(m3.lookingAt()==true){
            System.out.println("Шаблон співпадає з початком 3 текстового рядка");
        }
        else {
            System.out.println("Шаблон не співпадає з початком 3 текстового рядка");
        }
    }
}
