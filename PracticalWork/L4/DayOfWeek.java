import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayOfWeek {

	public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Please enter the number of day of the week (1-7) to output it on three languages.");
	int x = Integer.parseInt(reader.readLine());
	
	switch (x)
	{
	case 1:
	System.out.println("Mondey, Lundi, Poniedziałek.");
	break;
	
	case 2:
		System.out.println("Tuesday, Mardi, Wtorek.");
		break;
		
	case 3:
		System.out.println("Wednesday, Mercredi, Środa.");
		break;
		
	case 4:
		System.out.println("Thursday, Jeudi, Czwartek.");
		break;
		
	case 5:
		System.out.println("Friday, Vendredi, Piątek.");
		break;
		
	case 6:
		System.out.println("Saturday, Samedi, Sobota.");
		break;
		
	case 7:
		System.out.println("Sunday, Dimanche, Niedziela.");
		break;
		
		default:
		System.out.println("Error, you enter 0 or nuber > 7");
		
	}

	}
}
