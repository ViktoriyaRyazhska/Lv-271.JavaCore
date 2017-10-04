	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Task1 {
	  public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

	System.out.println("Enter the radius?");
	double radius = Double.parseDouble(br.readLine());
	final double P = 3.14;
	double perimeter = 2*P*radius;
	System.out.println("The perimeter is: " + perimeter);  
	double area = P*radius*radius;
	System.out.println("The area is: " + area);
	  }
	}


