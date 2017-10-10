package PractiseTask.l4;

public class Odd {

	private int odd = 0;

	public void printOdd(int integer, int... numbers) {
		System.out.println(integer);
		for (int numb : numbers) {
			System.out.println(numb);
		}
		if (integer < 0) {
			integer = -1 * integer;
		}
		if (integer % 2 == 1) {
			this.odd++;
		}
		for (int numb : numbers) {
			if (numb < 1) {
				numb = -1 * numb;
			}
			if (numb % 2 == 1) {
				this.odd++;
			}
		}
		System.out.println("We entered " + odd + " odd integers");
	}
}
