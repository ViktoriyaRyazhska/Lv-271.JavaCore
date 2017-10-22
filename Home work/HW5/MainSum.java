package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainSum {

	public static void main(String[] args) throws  IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//2 task from HomeWork, Arrays. Loops.
		int[] arr1=new int[10];
		int sum=0, prod=1, nNeg=0;
		System.out.println("Enter 10 integer numbers:");
		for (int i=0; i<arr1.length; i++) {
			arr1[i]=Integer.parseInt(br.readLine());
				if (i<5) {
					if (arr1[i]>=0) {
						sum=sum+arr1[i];
					} else {nNeg++;}
				} else {prod=prod*arr1[i];}
			
		}
		if (nNeg==0) {
			System.out.println("Sum is: "+sum);
		}else {System.out.println("prod is: "+prod);}
		//3 task from HomeWork, Arrays. Loops.
		
		System.out.println("Enter 5 integer numbers:");
		int[] arr2=new int[5];
		int s=0, pos=0, min, posMin;
		
		for (int i=0; i<arr2.length; i++) {
			arr2[i]=Integer.parseInt(br.readLine());
				if ((arr2[i]>0)&&(s<=2)){
					pos=i;
					}
		}
		
		min=arr2[0];
		posMin=0;
		for (int i=1; i<arr2.length; i++) {
			if (min>arr2[i]){
				posMin=i;
				min=arr2[i];
			}
		}
		System.out.println("Position second positive number is:"+(pos+1));
		System.out.println("Min number is:"+min+"position is:"+(posMin+1));
		
		

	}

}
