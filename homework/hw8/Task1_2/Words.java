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
		int lenth = getSentence().length();
		String word;
		String longestWord = null;
		int wordIterator = 0;
		int wordLenth = 0;
		int maxWordLenth = 0;
		int numberFirstLetter = 0;
		int[] numbers = new int[getSentence().length()];
		char c;
		for (int i = 0; i < lenth; i++) {
			wordLenth++;
			c = getSentence().charAt(i);
			if (c == ' ' | c == ',' | c == '.' | i == lenth - 1) {
				wordLenth--;
				if (wordIterator == 0) {
					word = getSentence().substring(0, i);
					numberFirstLetter = 0;
				} else if (i == lenth - 1) {
					word = getSentence().substring(wordIterator + 1, i + 1);
					wordLenth++;
					numberFirstLetter = wordIterator + 1;
				} else {
					word = getSentence().substring(wordIterator + 1, i);
					numberFirstLetter = wordIterator + 1;
				}
				if (wordLenth > maxWordLenth) {
					maxWordLenth = wordLenth;
					longestWord = word;
					for (int j = 0; j < maxWordLenth; j++) {
						numbers[j] = numberFirstLetter + 1;
						numberFirstLetter++;
					}

				}
				wordIterator = i;
				wordLenth = 0;
				System.out.println(word);
			}
		}
		System.out.println("The longest word is: " + longestWord);
		System.out.println("The lenth of the longest world is " + maxWordLenth);
		System.out.println("The numbers of letters is: ");
		for (int i = 0; i < maxWordLenth; i++) {
			System.out.print(numbers[i] + " ");
			if(i == maxWordLenth-1){
				System.out.println(numbers[i]);
			}
		}
	}

	public void secondWordRevers(Words sent) {
		int lenth = getSentence().length();
		String secondWord = null;
		int wordCounter = 0;
		char c;
		int wordIterator = 0;
		for (int i = 0; i < lenth; i++) {
			c = getSentence().charAt(i);
			if (c == ' ' | c == ',' | c == '.' | i == lenth - 1) {
				wordCounter++;
				if (wordCounter == 2) {
					if (i == lenth - 1) {
						secondWord = getSentence().substring(wordIterator + 1, i + 1);
					} else {
						secondWord = getSentence().substring(wordIterator + 1, i);
					}
				}
				wordIterator = i;
			}
		}
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
