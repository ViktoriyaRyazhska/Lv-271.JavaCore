package lesson4;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		System.out.println("Enter the name of the country");
		Scanner sc = new Scanner(System.in);
		String cauntry = sc.nextLine();;
		switch (cauntry.toLowerCase()) {
		case "antigua and barbuda": case "bahamas": case "barbados": case "canada": case "costa Rica": 
		case "cuba": case "haiti": case "honduras": case "jamaica": 
		case "mexico": case "panama": case "saint Lucia": case "usa":
			System.out.println("NORTH AMERICA");  break; 
		case "argentina": case "bolivia": case "brazil": case "chile": case "colombia": case "ecuador": 
			System.out.println("SOUTH AMERICA");  break; 
		case "albania": case "austria": case "belgium": case "bulgaria": case "croatia": case "denmark": 
		case "estonia": case "poland": case "ukraine": case "united Kingdom":
			System.out.println("EUROPE");  break; 
		case "australia": case "papua new guinea": case "fiji": case "new zealand": 
			System.out.println("Australia and Oceania"); break;
		case "algeria": case "angola": case "burkina faso": case "congo": case "egypt": case "ethiopia": 
		case "south africa": case "tunisia":
			System.out.println("AFRICA"); break;
		case "afghanistan": case "bangladesh": case "china": case "iran": case "vietnam":  
			System.out.println("ASIA"); break;
		}
	}
}
