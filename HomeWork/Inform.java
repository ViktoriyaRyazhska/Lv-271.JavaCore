import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inform {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("What is your name?");
	String name = reader.readLine();
	System.out.println("Where do live " + name + "?");
	String adress = reader.readLine();
	System.out.println("Your name is " + name + " and you live in " + adress + ".");
		
	}

}
