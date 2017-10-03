package l3;

public class Helper {

	private static Helper instance;

	private Helper() {
	}

	public static Helper getHelper() {
		if (instance == null) {
			instance = new Helper();
		}
		return instance;
	}
}