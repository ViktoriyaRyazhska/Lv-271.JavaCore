package PractiseTask.l4;

public class Continents {

	private enum Continent {
		Africa, Asia, Europ, NorthAmerica, SouthAmerica, Antarctica, Australia
	}

	private String country;

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

	public Continents(String country) {
		this.country = country;
	}

	public Continents() {
	}

	public void getContinent() {
		Continent continent;
		switch (this.country) {
		case "Angola":
		case "Algeria":
		case "Egypt":
			continent = Continent.Africa;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Ukraine":
		case "Italia":
		case "France":
		case "Portugal":
			continent = Continent.Europ;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Mongolia":
		case "India":
		case "China":
			continent = Continent.Asia;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Australia":
			continent = Continent.Australia;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Argentina":
		case "Peru":
		case "Brasil":
			continent = Continent.SouthAmerica;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Canada":
		case "United States":
		case "Mexico":
			continent = Continent.NorthAmerica;
			System.out.println(this.country + " belongs to " + continent);
			break;
		case "Anrarctica":
		case "happypenguins":
			continent = Continent.Antarctica;
			System.out.println(this.country + " belongs to " + continent);
			break;
		default:
			System.out.println(this.country + " is wrong country");
			break;
		}
	}
}
