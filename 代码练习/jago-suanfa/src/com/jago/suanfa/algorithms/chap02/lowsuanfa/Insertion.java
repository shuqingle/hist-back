package com.jago.suanfa.algorithms.chap02.lowsuanfa;

/**
 * 插入排序
 */
public class Insertion extends Example{

    @Override
    public void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            for (int j = i; j > 0 && less(a[j],a[j-1]); j--) {
                exch(a,j,j-1);
            }
        }
    }

    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        String [] a = new String[]{"8","3","1","5","4"};
        insertion.test(a);
    }
}
