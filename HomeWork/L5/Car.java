package L5;

public class Car {
	private String type;
	private int yearProd;
	private int engineCap;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYearProd() {
		return yearProd;
	}

	public void setYearProd(int yearProd) {
		this.yearProd = yearProd;
	}

	public int getEngineCap() {
		return engineCap;
	}

	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}

	public Car(String type, int yearProd, int engineCap) {
		this.type = type;
		this.yearProd = yearProd;
		this.engineCap = engineCap;
	}

	public Car() {

	}

	@Override
	public String toString() {
		return "Car type " + type + ", yearProd " + yearProd + ", engineCap " + engineCap + ".";
	}

}
