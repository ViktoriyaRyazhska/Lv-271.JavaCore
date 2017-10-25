package com.company.lesson4;


public class Dog {
    /*
    Сreate class Dog with fields name, breed, age.
    Declare enum for field breed.
    Create 3 instances of type Dog.
    Check if there is no two dogs with the same name.
    Display the name and the kind of the oldest dog.
    */
    private String name;
    private Breed breed;
    private int age;

    public Dog(String name, Breed breed, int age){
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed(){
        return breed;
    }
    public void setBreed(Breed breed){
        this.breed = breed;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true; }
        if ((object == null)||(this.getClass() != object.getClass())){
            return false;}

        Dog secondDog = (Dog)object;
        if ((age == secondDog.age) &&
            (breed == secondDog.breed)&&
            (name == secondDog.name)){
            return true;
        }

        return false;
    }


}
