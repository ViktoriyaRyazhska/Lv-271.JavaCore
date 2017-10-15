package HW4;

public class Numbers {
	
	public static void checkNum(float numb){
		boolean result;
		if (numb>=-5 && numb<=5) {
			result=true;
		}
		else {
			result=false;
		}
		System.out.println("Number: "+numb+" is belong to range [-5;5]: "+result);
	}
	
	public static void findMax(int numIn1, int numIn2, int numIn3){
		int max;
			if (numIn1>=numIn2 && numIn1>=numIn3){
				max=numIn1;
			} else{
				if (numIn2>=numIn1 && numIn2>=numIn3){
					max=numIn2;
				} else{
					max=numIn3;
				}
			}
		
		System.out.println("Max number is: " + max);
	}
	public static void findMin(int numIn1, int numIn2, int numIn3){
		int min;
			if (numIn1<=numIn2 && numIn1<=numIn3){
				min=numIn1;
			} else{
				if (numIn2<=numIn1 && numIn2<=numIn3){
					min=numIn2;
				} else{
					min=numIn3;
				}
			}
		
		System.out.println("Min number is: " + min);
	}

}
