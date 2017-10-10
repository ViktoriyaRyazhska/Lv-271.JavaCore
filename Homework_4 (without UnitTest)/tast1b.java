package homework4;

public class tast1b {
	public static void main(String[] args) {
		int a = 140087;
		int b = 1224;
		int c = 4548;
		System.out.print("The largest number is ");
			if(a>=b && a>=c) {
				System.out.println(a);
			}
			if(b>=a && b>=c) {
				System.out.println(b);
			}
			if(c>=a && c>=b) {
				System.out.println(c);
			}
		System.out.print("The smallest number is ");
			if(a<=b && a<=c) {
				System.out.println(a);
			}
			if(b<=a && b<=c) {
				System.out.println(b);
			}
			if(c<=a && c<=b) {
				System.out.println(c);
			}
	}
}
