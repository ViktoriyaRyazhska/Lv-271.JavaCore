package L5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunNumArr {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		NumArr arr = new NumArr();
		arr.inpunInteger(reader);
		arr.bigNum(arr.getNum());
		arr.amNegNum(arr.getNum());
		arr.amPosVal(arr.getNum());
		arr.posNegVal();;
	}
}
