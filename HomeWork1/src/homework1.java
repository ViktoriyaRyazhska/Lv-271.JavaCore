import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homework1 {

public static void main(String[] args) throws IOException {
	    
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
System.out.println("Task 1:");
	double r, Per, Area;
	double Pi = 3.1415;
	System.out.print("Enter radius of circle = ");
	r = Double.parseDouble(br.readLine());
	Per = 2 * Pi * r;
	Area = Pi * r * r;
	System.out.println("Perimeter = " + Per);
	System.out.println("Area = " + Area);
	
System.out.println("Task 2:");
	String name, address;
	System.out.println("What is your name?");
	name = br.readLine();
	System.out.println("Where are you live, " + name + "?");
	address = br.readLine();
	System.out.println("Your name is " + name + ". You live in " + address + ".");
	
System.out.println("Task 3:");
	double c1, c2, c3, t1, t2, t3, count1, count2, count3, sum;
	
	System.out.print("Enter c1 = ");
	c1 = Double.parseDouble(br.readLine());
	System.out.print("Enter c2 = ");
	c2 = Double.parseDouble(br.readLine());
	System.out.print("Enter c3 = ");
	c3 = Double.parseDouble(br.readLine());
	System.out.print("Enter t1 = ");
	t1 = Double.parseDouble(br.readLine());
	System.out.print("Enter t2 = ");
	t2 = Double.parseDouble(br.readLine());
	System.out.print("Enter t3 = ");
	t3 = Double.parseDouble(br.readLine());
	count1 = c1 * t1;
	count2 = c2 * t2;
	count3 = c3 * t3;
	sum = count1 + count2 + count3;
	System.out.println("Count for each countries:");
	System.out.println("Country 1 = " + count1);
	System.out.println("Country 2 = " + count2);
	System.out.println("Country 3 = " + count3);
	System.out.println("Summarily = " + sum);
}
}
