package scanner;

import java.util.Scanner;

public class Scr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Scrmain scrmain = new Scrmain();
        scrmain.swap(a,b);
    }
}
