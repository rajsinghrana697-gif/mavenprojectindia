package com.Logic.oops;

public class Volvo implements Car {
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
        System.out.println("volvo petrol");

    }

    @Override
    public void accelerate() {
        System.out.println("volvo accelerate");

    }

    @Override
    public void slowdown() {
        System.out.println("volvo slowdown");

    }
}
