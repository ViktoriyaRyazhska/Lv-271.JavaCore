package homework.hw9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = 0;
		double b = 0;
		try {
			System.out.println("Enter a:");
			a = Double.parseDouble(br.readLine());
			System.out.println("Enter b:");
			b = Double.parseDouble(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

		double result = 0;
		try {
			result = div(a, b);
		} catch (ZeroExeption e) {
			System.out.println("U can't div 0");
			e.printStackTrace();
		}
		System.out.println(result);
		System.out.println("Enter 10 integers from 1 to 100");
		int numb = 0;
		for (int i = 0; i < 10; i++) {
			numb = readNumber(br, 1, 100);
			System.out.println(numb);
		}

	}

	public static double div(double a, double b) throws ZeroExeption {
		if (b == 0) {
			throw new ZeroExeption();
		} else
			return a / b;
	}

	public static int readNumber(BufferedReader br, int start, int end) {
		int numb = 0;
		try {
			numb = Integer.parseInt(br.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		if(numb>=start&&numb <= end){
			return numb;
		}else{
			try{
				throw new InvalidNumber();
			}catch(InvalidNumber e){
				System.out.println("Wrong number");
				e.printStackTrace();
				return 0;
			}
			
		}
		
	}
}
