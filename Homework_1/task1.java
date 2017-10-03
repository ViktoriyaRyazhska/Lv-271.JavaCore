package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));
			System.out.println("Enter the radius of the circle");
			double r = Double.parseDouble(br.readLine());
		System.out.println("P=" + 2*Math.PI*r);
		System.out.println("S=" + Math.PI*r*r);
		
		}
}
