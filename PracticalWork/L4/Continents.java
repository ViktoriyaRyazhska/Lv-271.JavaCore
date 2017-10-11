import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Continents {
	
public enum Continent
		{
			NorthAmerica, SouthAmerica, Europe, Asia, Australia, Africa, Antarctica
		}
	public static void main(String[] args) throws IOException {
		System.out.println("Please eneter the country to find out the Continent...");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String country = reader.readLine();
		Continent continent = null;
		
		switch (country)
		{
		case "USA": case "Canada":
			continent = Continent.NorthAmerica; break;
		case "Brasil": case "Argentina": case "Mexico":
			continent = Continent.SouthAmerica; break;
		case "England": case "Franse": case "Spaine": case "Italy": case "Ukraine": case "Germany": case "Poland": case "Swiss":
			continent = Continent.Europe; break;
		case "Russia": case "India": case "China": case "Indonesia": case "Kasahstan":
			continent = Continent.Asia; break;
		case "Australia":
			continent = Continent.Australia; break;
		case "Egypte": case "Congo": case "SAR": case "Cote di voire": case "Mosambic":
			continent = Continent.Africa; break;
		case "Antarctica":
			continent = Continent.Antarctica; break;
		default:
			System.out.println("Oops, sorry, but I don`t know such country."); break;
		}
		System.out.println("The Continent is " + continent +".");
		}
}