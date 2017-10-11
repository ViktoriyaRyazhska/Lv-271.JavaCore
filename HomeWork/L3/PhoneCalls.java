import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		double c1 = 3.55; //unit price
		double c2 = 5.99;
		double c3 = 8.60;
		
		int t1 = Integer.parseInt(reader.readLine()); //entering minutes
		int t2 = Integer.parseInt(reader.readLine());
		int t3 = Integer.parseInt(reader.readLine());
		
		double x1 = c1*t1; //calculating
		double x2 = c2*t2;
		double x3 = c3*t3;
		double x4 = x1+x2+x3;
		
		System.out.println("First call costs " + x1 + ";"); //output
		System.out.println("Second call costs " + x2+";");
		System.out.println("Third call costs " + x3+";");
		System.out.println("Total price is " + x4+";");

	}

}
