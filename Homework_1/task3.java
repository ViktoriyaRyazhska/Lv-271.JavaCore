package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task3 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("How long was the talk with the country c1");
		int t1 = Integer.parseInt(br.readLine());
		System.out.println("How long was the talk with the country c2");
		int t2 = Integer.parseInt(br.readLine());
		System.out.println("How long was the talk with the country c3");
		int t3 = Integer.parseInt(br.readLine());
		double p1 = 1.08;	// the cost of one minute with the country c1
		double p2 = 0.78;	// the cost of one minute with the country c2
		double p3 = 0.03;	// the cost of one minute with the country c3
		double cost_c1 = t1*p1;	// total cost of talking with country ñ1
		double cost_c2 = t2*p2;	// total cost of talking with country ñ2
		double cost_c3 = t3*p3;	// total cost of talking with country ñ3
		System.out.println("Cost of talking with country ñ1: " + cost_c1 + "$");
		System.out.println("Cost of talking with country ñ2: " + cost_c2 + "$");
		System.out.println("Cost of talking with country ñ1: " + cost_c3 + "$");
		System.out.println("Total: " + (cost_c1+cost_c2+cost_c3) + "$");
	}
	
}
