package homework.hw4;

public class Dog {

	private String name;
	private String breed;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}

	public Dog() {
	}

	public static void sameName(Dog dog, Dog... dogs) {
		String name = dog.getName();
		int count = 1;
		for (Dog dg : dogs) {
			if (dg.getName() == name) {
				count++;
				name = dg.getName();
			}
		}
		if(count>1){
		System.out.println("We have " + count + " dogs with same name");
		}
	}

	public static void theOldestDog(Dog dog, Dog... dogs) {
		int theOldest = dog.getAge();
		for (Dog dg : dogs) {
			if (dg.getAge() > theOldest) {
				theOldest = dg.getAge();
			}
		}
		if (theOldest == dog.getAge()) {
			System.out.println("The oldest dog is: ");
			System.out.println(dog.getName() + " " + dog.getBreed());
		}
		for (Dog dg : dogs) {
			if (theOldest == dg.getAge()) {
				System.out.println("The oldest dog is: ");
				System.out.println(dg.getName() + " " + dg.getBreed());
			}
		}

	}
}
