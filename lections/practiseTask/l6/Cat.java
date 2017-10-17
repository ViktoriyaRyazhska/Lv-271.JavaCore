package PractiseTask.l6;

public class Cat implements Animal {

	private boolean feed;

	public boolean getFeed() {
		return this.feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}

	public Cat() {
	}
	
	public Cat(boolean feed){
		this.feed=feed;
	}
	@Override
	public void voice() {
		System.out.println("Myav");

	}

	@Override
	public void feed() {
		if (this.feed == true) {
			System.out.println("The cat is satisfied");
		} else {
			System.out.println("Cat want to eat");
		}
	}

}
