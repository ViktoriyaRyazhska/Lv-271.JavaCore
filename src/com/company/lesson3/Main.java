package com.company.lesson3;


public class Main {
    public static void main(String[] Args){
        Person person1 = new Person();
        person1.setName("Alisa");
        person1.setBirthYear(2000);

        Person person2 = new Person("Vasya", 1992);
        Person person3 = new Person("Sasha", 1967);
        Person person4 = new Person("Kolya", 2007);
        Person person5 = new Person("Corruptor", 1570);

        person1.printer();
        person2.printer();
        person3.printer();
        person4.printer();
        person5.printer();


    }



}
