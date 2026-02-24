package com.Logic.oops;

public interface Car {
    default void reversegear() {
        System.out.println("reverse gear");
    }

    default void radio() {
        System.out.println("radio");
    }

    public void petrol();
    public void accelerate();
    public void slowdown();
}
