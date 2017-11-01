package homework10;

public class task1 {

	public static void main(String[] args) throws Exception {
		Thread one = new MyThread("one");
		Thread two = new MyThread("two");
		Thread three = new MyThread("three");
		one.start();
		two.start();
		one.join();
		two.join();
		three.start();
	}

}
