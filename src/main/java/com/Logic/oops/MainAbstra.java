package com.Logic.oops;

public class MainAbstra {
    public static void main(String[] args) {
        Abstra abstra= new Abstra() {
            @Override
            public void test() {
                System.out.println("testj");

            }
        };
        abstra.test();
        abstra.exam();
    }
}
