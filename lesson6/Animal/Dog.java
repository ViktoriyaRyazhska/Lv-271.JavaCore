package lesson6;

public class Dog implements Animal{
	private String voice;
	private String feed;
		
	public Dog() {
	}
	

	public Dog(String voice, String feed) {
		this.voice = voice;
		this.feed = feed;
	}


	public String getVoice() {
		return voice;
	}


	public void setVoice(String voice) {
		this.voice = voice;
	}


	public String getFeed() {
		return feed;
	}


	public void setFeed(String feed) {
		this.feed = feed;
	}


	@Override
	public String toString() {
		return "Dog [voice=" + voice + ", feed=" + feed + "]";
	}


	@Override
	public String voice() {
		return this.voice;
	}

	@Override
	public String feed() {
		return this.feed;
	}

}
