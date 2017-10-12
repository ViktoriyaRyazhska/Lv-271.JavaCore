package homework5;

public class test2 {

	public static void main(String[] args) {
		int numbers [] = {5, 15, 10, 27, -7, -9, 20, 0, 97, -4};
		int sum =0;
		int product =1;
			if((numbers [0]>0) && (numbers [1]>0) && (numbers [2]>0) && (numbers [3]>0) && (numbers [4]>0)){
				for(int i=0; i<5; i++) {
					sum += numbers[i];
					continue;
				}
				System.out.println("sum of first 5 elements: " + sum);
			}
			else {
				for(int i=numbers.length - 5; i<numbers.length; i++) {
					product *=numbers[i];
					continue;
				}
				System.out.println("product of last 5 element: " + product);
			}
			
	}

}
