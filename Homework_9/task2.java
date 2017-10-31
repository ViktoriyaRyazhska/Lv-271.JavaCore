package homwork9;

import java.io.IOException;
import java.util.Scanner;

public class task2 {
	public static int readNumber(int start, int end, int n) throws IOException{
		if((n>=start)&&(n<=end)) {
			return n;
		}
		else {
			throw new ArithmeticException("you are out of the range of " + start + " to " + end);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int start = 10;
		int end = 88;
		
		System.out.println("entern umbers from " + start + " to " + end);
		int i = 0;
		int n;
		while(i<10) {
			try {
				n = sc.nextInt();
				readNumber(start, end, n);
				start = n;
				i++;
			} catch (ArithmeticException|IOException|NumberFormatException e) {
				System.out.println(e);
				continue;
			} 
		}
		sc.close();
	}

}
