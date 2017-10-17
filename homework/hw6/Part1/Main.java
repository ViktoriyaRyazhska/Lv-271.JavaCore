package homework.hw6.Part1;

public class Main {
	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle();
		birds[1] = new Swallow();
		birds[2] = new Penguin();
		birds[3] = new Kiwi();
		for(int i=0; i<4; i++){
			birds[i].fly();
			birds[i].information();
		}
		
	}
	
}
