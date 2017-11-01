package homework10;

public class task2 {

	public static void main(String[] args) {
		final Object one = new Object();
		final Object two = new Object();
		Thread t1 = new Thread("Thread 1") {
			public void run() {
				synchronized (one) {
					try {
						one.wait();
					} catch (Throwable ignored) {
					}
					synchronized (two) {
						System.out.println("Hello Thread 1");
	}}}};
	Thread t2 = new Thread("Thread 2") {
		public void run() {
			synchronized (two) {
				try {
					two.wait();
				} catch (Throwable ignored) {
				}
				synchronized (one) {
					System.out.println("Hello Thread 2");
	}}}};
		t1.start();
		t2.start();
		
	}

}
