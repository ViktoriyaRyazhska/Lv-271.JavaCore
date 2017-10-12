package HW4;

public class SoftHome42 {
    public static void main(String[] args) {
        Dog dog=new Dog("Kiki","Labrador",4);
        Dog dog1=new Dog("Kiki","Bolonka",2);
        Dog dog2=new Dog("Kashtan","Labrador",5);

        int count=0;

        if((dog.getName().equals(dog1.getName())) || (dog.getName().equals(dog2.getName()))|| (dog1.getName().equals(dog2.getName()))){
            count++;
        }
        System.out.println("We have "+count+" with the same names");

        Dog.theOldestDog(dog, dog1, dog2);

    }
}
