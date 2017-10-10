package homework4;

public class App {
	public static void main(String[] args) {
		Dog dog1 = new Dog("Ruta", "Vizsla", 4);
		Dog dog2 = new Dog("Suri", "Irish Setter", 11);
		Dog dog3 = new Dog("Jack", "Otterhound", 6);
		if (dog1.getName()==dog2.getName() || dog1.getName()==dog3.getName() || dog2.getName()==dog3.getName()) {
			System.out.println("We have dogs with the same names");
		}
		else {
			System.out.println("Dogs with the same names are not");
		}
		
		if (dog1.getAge()>=dog2.getAge() && dog1.getAge()>=dog3.getAge()) {
			System.out.println("The oldest dog is " + dog1.getName() + ", breed " + dog1.getBreed());
		}
		if (dog2.getAge()>=dog1.getAge() && dog2.getAge()>=dog3.getAge()) {
			System.out.println("The oldest dog is " + dog2.getName() + ", breed " + dog2.getBreed());
		}
		if (dog3.getAge()>=dog1.getAge() && dog3.getAge()>=dog2.getAge()) {
			System.out.println("The oldest dog is " + dog3.getName() + ", breed " + dog3.getBreed());
		}
	}
}
