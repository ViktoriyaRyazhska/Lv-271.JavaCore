package homework.hw6.Part1;

public class Swallow extends FlyingBird{

	private String sing = "nice singer";
	
	public String getSing() {
		return sing;
	}
	public void setSing(String sing) {
		this.sing = sing;
	}
	public Swallow(){
		setName("Swallow");
		setFeathers("short feathers");
		setLayEggs(true);
	}
	@Override
	public void information(){
		super.information();
		System.out.println(getName() + " is " + getSing());
	}
}
