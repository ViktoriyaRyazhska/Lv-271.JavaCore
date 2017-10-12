package homework.hw5;

import java.io.BufferedReader;
import java.io.IOException;

public class Month {

	private int number;
	private int[] month = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int[] getMonth() {
		return month;
	}

	public void setMonth(int[] month) {
		this.month = month;
	}

	public Month(int number) {
		this.number = number;
	}

	public Month() {
	}
	
	public void enterTheNumber(BufferedReader br) throws NumberFormatException, IOException{
		System.out.println("Enter the number of month: ");
		this.number = Integer.parseInt(br.readLine());
		if(this.number > 12 || this.number < 1){
			System.out.println("Wrong number");
		}else {
			System.out.println("This month has " + month[number-1] + " days");
		}
	}
	
}
