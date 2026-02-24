package scanner;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enr no");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        Addition addition = new Addition();
        addition.sum(a,b,c);
    }
}