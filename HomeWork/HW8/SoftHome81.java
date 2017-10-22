import java.util.Scanner;
import java.util.StringTokenizer;

public class SoftHome81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myLine = sc.nextLine();

        myLine = myLine + " ";
        String x = "", maxw = "";
        char ch;
        int p, maxl = 0;

        for (int i = 0; i < myLine.length(); i++) {
            ch = myLine.charAt(i);
            if (ch != ' ') {
                x = x + ch;
            } else {
                p = x.length();

                if (p > maxl) {
                    maxl = p;
                    maxw = x;
                }
                x = "";
            }
        }
        System.out.println("Longest word = " + maxw + "\nLength = " + maxl);

        StringTokenizer tokenizer = new StringTokenizer(myLine);
        String firstArg = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";
        String secondArg = tokenizer.hasMoreTokens() ? tokenizer.nextToken() : "";

        StringBuffer buffer = new StringBuffer(secondArg);
        buffer.reverse();
        System.out.println(buffer);
    }
}

