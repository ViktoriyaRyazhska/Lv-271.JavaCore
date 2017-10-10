package l4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunRageOfNumbers {
	

	public static void main(String[] args) throws IOException{
		RangeOfNumbers rage = new RangeOfNumbers();
		System.out.println("Please enter 3 float numbers....");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		float a = Float.parseFloat(reader.readLine());
		float b = Float.parseFloat(reader.readLine());
		float c = Float.parseFloat(reader.readLine());
				 
		rage.Numbers(a, b, c);
		rage.output(rage.x);
	}
}
