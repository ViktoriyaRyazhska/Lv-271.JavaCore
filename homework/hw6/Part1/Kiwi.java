package homework.hw6.Part1;

public class Kiwi extends NonFlyingBird {
	private String run = "fast run";
	
	public String getRun() {
		return run;
	}
	public void setRun(String run) {
		this.run = run;
	}
	public Kiwi(){
		setName("Kiwi");
		setFeathers("short feathers");
		setLayEggs(false);
	}
	@Override
	public void information(){
		super.information();
		System.out.println(getName() + " can " + getRun());
	}
}
