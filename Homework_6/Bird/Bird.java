package homework6;

public abstract class Bird {
	private String feathers;
	private String layEggs;
	
	public Bird(String feathers, String layEggs) {
		this.feathers = feathers;
		this.layEggs = layEggs;
	}

	abstract void fly();
}
