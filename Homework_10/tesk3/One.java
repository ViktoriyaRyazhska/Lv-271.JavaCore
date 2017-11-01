package homework10;

	public class One extends Thread{
		public void run() {
			Two runTwo = new Two();
			runTwo.run();
		}
	}
