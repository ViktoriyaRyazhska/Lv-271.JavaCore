import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneCalls {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(
		new InputStreamReader(System.in));

	System.out.println("Enter the call charging for the first country ");
	int c1 = Integer.parseInt(br.readLine());
	System.out.println("Enter the call duration ");
	double t1 = Double.parseDouble(br.readLine());
	System.out.println("Enter the call charging for the second country ");
	int c2 = Integer.parseInt(br.readLine());
	System.out.println("Enter the call duration ");
	double t2 = Double.parseDouble(br.readLine());
	System.out.println("Enter the call charging for the third country ");
	int c3 = Integer.parseInt(br.readLine());
	System.out.println("Enter the call duration ");
	double t3 = Double.parseDouble(br.readLine());
	System.out.println("The cost of the first call is " + c1*t1);  
	System.out.println("The cost of the second call is " + c2*t2);
	System.out.println("The cost of the third call is " + c3*t3);
	System.out.println("The cost of all calls is " + ((c1*t1)+(c2*t2)+(c3*t3)));
	  }
	}

