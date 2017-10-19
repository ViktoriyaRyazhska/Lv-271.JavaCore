package homework6;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(String feathers, String layEggs) {
		super(feathers, layEggs);
	}

	@Override
	void fly() {
		System.out.println("Not Flying Bird");
	}

}
