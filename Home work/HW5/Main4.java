package HW5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int str;
		int count=0;
		
		while (true) {
			str=Integer.parseInt(br.readLine());
			if (str>=0) {
				count++;
			} else {break;}
		}
		
		System.out.println("count: "+count);

	}
}


