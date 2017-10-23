package HomeWork.L8;

import java.util.ArrayList;
import java.util.List;

public class Words {

	public static void main(String[] args) {
		String sentence = "Hello am don`t know how";
		
		
		int x1 = sentence.indexOf(" ");
		int x2 = sentence.indexOf(" ", x1+1);
		int x3 = sentence.indexOf(" ", x2+1);
		int x4 = sentence.indexOf(" ", x3+1);
		
		String firstWord = sentence.substring(0, x1);
		
		String secondWord1 = sentence.substring(x1, x2);
		String secondWord = secondWord1.trim();
		
		String thirdWord1 = sentence.substring(x2, x3);
		String thirdWord =  thirdWord1.trim();
		
		String fourthWord1 = sentence.substring(x3, x4);
		String fourthWord =  fourthWord1.trim();
		
		String fifthWord1 = sentence.substring(x4);
		String fifthWord =  fifthWord1.trim();
		
		List<String> word = new ArrayList<String>();
		word.add(firstWord);
		word.add(secondWord);
		word.add(thirdWord);
		word.add(fourthWord);
		word.add(fifthWord);
		String tmp = word.get(0);
		for(int i=1; i<word.size(); i++)
		{
			if(tmp.length()<word.get(i).length())
			{
				tmp = word.get(i);
			}
		}
		
		StringBuilder s1 = new StringBuilder(tmp);
		s1.reverse();
		String s2 = s1.toString();
		
		System.out.println("The bsggest word is " + tmp + ".");
		System.out.println("The numbers length is " + tmp.length());
		System.out.println("The reverse is " + s2);
		
		
		
		
	}

}
