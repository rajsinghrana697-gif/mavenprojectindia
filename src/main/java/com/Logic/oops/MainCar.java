package com.Logic.oops;

public class MainCar {
    public static void main(String[] args) {
        Audi  audi = new Audi();
        Volvo volvo = new Volvo();
        audi.slowdown();
        volvo.slowdown();
        audi.accelerate();
        volvo.accelerate();
        audi.petrol();
        volvo.petrol();
        audi.radio();
        volvo.radio();
        audi.reversegear();
        volvo.reversegear();
    }
}
