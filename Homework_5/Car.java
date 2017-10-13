package homework5;

public class Car {
	public String type;
	public int year;
	public double engine;
	public Car() {
	}
	public Car(String type, int year, double engine) {
		this.type = type;
		this.year = year;
		this.engine = engine;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public void output(){
		System.out.println("type=" + type + ", year=" + year + ", engine=" + engine);
	}
	@Override
	public String toString() {
		return "Car [type=" + type + ", year=" + year + ", engine=" + engine + "]";
	}
		
}
