package homework.hw6.Part1;

public abstract class Bird {
	private String feathers;
	private boolean layEggs;
	private String name;
	public boolean isLayEggs() {
		return layEggs;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLayEggs(boolean layEggs) {
		this.layEggs = layEggs;
	}
	public String getFeathers(){
		return this.feathers;
	}
	public void setFeathers(String feathers){
		this.feathers= feathers;
	}
	public Bird(){
	}
	public abstract void fly();
	public abstract void information();

}
