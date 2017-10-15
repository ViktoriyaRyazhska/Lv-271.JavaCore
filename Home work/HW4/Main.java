package HW4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException  {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter 3 float numbers:");
		float num1=Float.parseFloat(reader.readLine());
		float num2=Float.parseFloat(reader.readLine());
		float num3=Float.parseFloat(reader.readLine());
		Numbers.checkNum(num1);
		Numbers.checkNum(num2);
		Numbers.checkNum(num3);
		
		System.out.println("Enter 3 integer numbers:");
		int numIn1=Integer.parseInt(reader.readLine());
		int numIn2=Integer.parseInt(reader.readLine());
		int numIn3=Integer.parseInt(reader.readLine());
		Numbers.findMax(numIn1, numIn2, numIn3);
		Numbers.findMin(numIn1, numIn2, numIn3);
		
		HTTPErrors err1=new HTTPErrors();
		System.out.println("Enter error [400;410]:");
		int numbErr=Integer.parseInt(reader.readLine());
		err1.setNumb(numbErr);
		err1.readError();
		
		
		
		
		
		
		
		
		
		
		

	}

}
