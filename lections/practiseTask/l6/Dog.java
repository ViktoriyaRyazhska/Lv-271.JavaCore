package PractiseTask.l6;

public class Dog implements Animal {
	private boolean feed;
	
	
	
	public boolean isFeed() {
		return feed;
	}

	public void setFeed(boolean feed) {
		this.feed = feed;
	}
	
	public Dog(){
	}
	public Dog(boolean feed){
		this.feed=feed;
	}
	@Override
	public void voice() {
		System.out.println("Gav");
	}

	@Override
	public void feed() {
			if(this.feed == true){
				System.out.println("The dog is satisfied");
			}
			else{
				System.out.println("Dog want to eat");
			}
		}
	}
