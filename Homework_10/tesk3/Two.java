package homework10;

public  class Two extends Thread{
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("Thread number two");
		}
		Three runthree = new Three();
		runthree.run();
	}
}