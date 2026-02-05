package com.Logic;

import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
       int number= scanner.nextInt();
        Odd Odd = new Odd();
        Odd.setEven(number);
        Odd.evenodd();

    }
}
