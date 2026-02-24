package com.Logic.oops;

public class Audi implements Car {

    @Override
    public void reversegear() {
        Car.super.reversegear();
    }

    @Override
    public void radio() {
        Car.super.radio();
    }

    @Override
    public void petrol() {
        System.out.println("Audi petrol");

    }

    @Override
    public void accelerate() {
        System.out.println("Audi accelerate");

    }

    @Override
    public void slowdown() {
        System.out.println("Audi slowdown");

    }
}
