package com.company.lesson6.FlyingObjects;

public class NonFlyingBird extends Bird{

    public NonFlyingBird(String feathers, String layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
