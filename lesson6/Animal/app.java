package lesson6;

public class app {

	public static void main(String[] args) {
		Animal[] animal = new Animal[4];
		animal[0] = new Cat("Meow, my name is Alice", "Give me a fish");
		animal[1] = new Cat("Meow, my name is Kasya", "I love gourmet gold with turkey");
		animal[2] = new Dog("Woof", "Give me a bone");
		animal[3] = new Dog("Woof-Woof", "Give me something to eat");
		
		for(int i =0; i<animal.length; i++) {
			System.out.println(animal[i].toString());
		}
	}
}
