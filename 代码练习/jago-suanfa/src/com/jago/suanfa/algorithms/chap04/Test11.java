package com.jago.suanfa.algorithms.chap04;

public class Test11 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int x){
        System.out.print(x+" ");
        if (x==1) {
            System.out.println("");
            return 1;
        }
        return sum(x-1)+x;
    }
}
