package scanner;

import java.util.Scanner;

public class Scnr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("enter no");
        int a= scanner.nextInt();
        int b= scanner.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
