package HomeWork.L6;

public abstract class Bird {
	
	private String feathers;
	public String getFeathers() {
		return feathers;
	}

	public void setFeathers(String feathers) {
		this.feathers = feathers;
	}

	public int getLayEggs() {
		return layEggs;
	}

	public void setLayEggs(int layEggs) {
		this.layEggs = layEggs;
	}

	private int layEggs;
	
	public abstract boolean fly(); 
	

}
