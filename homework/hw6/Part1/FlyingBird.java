package homework.hw6.Part1;

public class FlyingBird extends Bird{
	public FlyingBird(){
	}
	@Override
	public void fly(){
		System.out.println(getName() + " can fly");
	}
	@Override
	public void information(){
		System.out.println(getName()+ " has "  + getFeathers());
		if(isLayEggs() == true){
			System.out.println(getName() + " can lay eggs");
		}else{
			System.out.println(getName() + " can't lay eggs");
		}
	}

}