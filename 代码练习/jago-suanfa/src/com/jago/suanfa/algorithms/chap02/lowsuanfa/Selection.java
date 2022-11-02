package com.jago.suanfa.algorithms.chap02.lowsuanfa;

/**
 * 选择排序
 */
public class Selection extends Example{
    public  void sort(Comparable[] a){
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j <N ; j++) {
                if (less(a[j],a[min])){
                    min = j;
                }
            }
            exch(a,i,min);
        }
    }

    public static void main(String[] args) {
        Selection selection = new Selection();
        String [] a = new String[]{"4","2","3","6","8"};
        selection.test(a);

    }
}
