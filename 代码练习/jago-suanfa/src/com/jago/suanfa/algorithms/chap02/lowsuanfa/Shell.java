package com.jago.suanfa.algorithms.chap02.lowsuanfa;

public class Shell extends Example {

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3){
            h = 3*h + 1;
        }
        while (h >= 1){
            for (int i = h; i < N; i++) {
                for (int j = i; j >= h && less(a[j],a[j-h]) ; j-=h) {
                    exch(a,j,j-h);
                }
            }
            h = h/3;
        }
    }

    public static void main(String[] args) {
        Shell shell = new Shell();
        String [] a = new String[]{"8","5","4","6","7","9"};
        shell.test(a);










    }
}
