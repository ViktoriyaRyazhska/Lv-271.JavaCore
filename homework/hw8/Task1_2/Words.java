package homework.hw8.Task1_2;

public class Words {

	private String sentence;

	public void setSentence(String sent) {
		this.sentence = sent;
	}

	public String getSentence() {
		return this.sentence;
	}

	public Words() {
		System.out.println("Enter the sentence: ");
	}

	public Words(String sent) {
		System.out.println("The sentence is: ");
		this.sentence = sent;
		System.out.println(this.sentence);
	}

	public void getLongestWord(Words sentence) {
		String word = getSentence();
		String[] words = word.split(" ");
		int max = 0;
		String theLongest = null;
		int firstLetter = 1;
		int numberOfLongest = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() > max) {
				max = words[i].length();
				theLongest = words[i];
				numberOfLongest = i;
			}

		}
		for (int i = 0; i <= numberOfLongest; i++) {
			if (i == 0) {
				firstLetter = 1;
			} else {
				firstLetter += words[i - 1].length() + 1;
			}
		}

		System.out.println("The longest word is " + theLongest + " and it has " + max + " letters");
		int[] numbers = new int[theLongest.length()];
		for (int i = 0; i < theLongest.length(); i++) {
			numbers[i] = firstLetter;
			firstLetter++;
		}
		for (int i = 0; i < theLongest.length(); i++) {
			if (i == theLongest.length() - 1) {
				System.out.println(numbers[i]);
			}else{
				System.out.print(numbers[i] + " ");
			}
		}

	}

	public void secondWordRevers(Words sent) {
		String[] words = getSentence().split(" ");
		String secondWord = words[1];
		int length = secondWord.length();
		char[] s = new char[length];
		for (int i = 0; i < secondWord.length(); i++, length--) {
			s[i] = secondWord.charAt(length - 1);
		}
		String reverse = new String(s);
		System.out.println("Second word: " + secondWord);
		System.out.println("Reversed second word: " + reverse);

	}

	public String convertSentence(Words sent) {
		String sentence = sent.getSentence();
		String convertedSent = sentence.replaceAll(" +", " ");
		System.out.println(convertedSent);
		this.sentence = convertedSent;
		return this.sentence;
	}
}
