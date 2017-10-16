package homework5;

public class test2 {

	public static void main(String[] args) {
		int numbers [] = {5, 15, 10, 27, -7, -9, 20, 0, 97, -4};
		int sum =0;
		int product =1;
		boolean flag = true;
		for(int i=0; i<5; i++) {
			if(numbers[i]<0) {
				flag = false;
			}
		}
		if(flag == true) {
			for(int i=0; i<5; i++) {
				if(numbers[i]>0) {
					sum += numbers[i];
				}
			}
			System.out.println("sum of first 5 elements: " + sum);
		}
		if(flag == false) {
			for(int i=numbers.length - 5; i<numbers.length; i++) {
				product *=numbers[i];
			}
			System.out.println("product of last 5 element: " + product);
		}
			
	}

}
