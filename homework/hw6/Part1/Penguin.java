package homework.hw6.Part1;

public class Penguin extends NonFlyingBird {

	private String swim = "can swim";

	public String getSwim() {
		return swim;
	}

	public void setSwim(String swim) {
		this.swim = swim;
	}

	public Penguin() {
		setName("Penguin");
		setFeathers("no feathers");
		setLayEggs(true);
	}

	@Override
	public void information() {
		super.information();
		System.out.println(getName() + " " + swim);
	}
}
