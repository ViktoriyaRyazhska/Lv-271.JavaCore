package HomeWork;

public class BigNum {

	public int a = 0;
	public int b = 0;
	public int c = 0;
	public int x = 0;
	public int y = 0;

	public int max(int a, int b, int c) {
		if (a > b && a > c)
			return x = a;
		if (b > a && b > c)
			return x = b;
		if (c > a && c > b)
			return x = c;
		return x;
	}

	public int min(int a, int b, int c) {
		if (a < b && a < c)
			return y = a;
		if (b < a && b < c)
			return y = b;
		if (c < a && c < b)
			return y = c;
		return y;
	}

	public void output() {
		System.out.println("The max number is " + x + ".");
		System.out.println("The min number is " + y + ".");
	}
}
