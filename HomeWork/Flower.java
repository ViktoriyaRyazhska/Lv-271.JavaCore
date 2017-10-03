import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower {

	public static void main(String[] args) throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double p = 3.1415;
		double r = Integer.parseInt(reader.readLine());
		double perim = (2 * p)*r;
		double area = (r*r)*p;
		
		System.out.println("Perimetr of flower - " + perim + ";");
		System.out.println("Area of flower - " + area + ";");

	}

}
