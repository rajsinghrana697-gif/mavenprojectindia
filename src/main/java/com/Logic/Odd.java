package com.Logic;

public class Odd {
    public int even;

    public int getEven() {
        return even;
    }

    public void setEven(int even) {
        this.even = even;
    }
    public void evenodd (){
        System.out.println(even%2);
        if ( even%2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}
