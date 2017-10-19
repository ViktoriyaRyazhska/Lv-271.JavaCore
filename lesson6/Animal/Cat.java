package lesson6;

public class Cat implements Animal{
	private String voice;
	private String feed;
	
	public Cat() {
	}
	

	public Cat(String voice, String feed) {
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
		return "Cat [voice=" + voice + ", feed=" + feed + "]";
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
