package com.jago.suanfa.algorithms.chap01;

/**
 * 加权union-find算法
 */
public class WeightQuickUnionUF {
    private int [] id;
    private int [] sz;
    private int count;

    public WeightQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    public int count(){
        return count;
    }

    public boolean connected(int p,int q){
        return find(p) == find(q);
    }

    public int find(int p){
        while (p != id[p]){
            p = id[p];
        }
        return p;
    }

    public void union(int p , int q){
        //找出树的根节点
        int i = find(p);
        int j = find(q);
        if (i == j) return;
        //小往大的堆归并
        if (sz[i] < sz[j]){//i是小树
            id[i] = j;//小树的根节点数字变为大树的根节点数字，这样从小树找到大树
            sz[j] += sz[i];//小树的数量累加到大树
        }else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;

    }

    public static void main(String[] args) {
        WeightQuickUnionUF unionUF = new WeightQuickUnionUF(10);
        unionUF.union(0,1);
        unionUF.union(0,2);
        unionUF.union(3,1);
        unionUF.union(3,4);
        unionUF.union(5,6);
        unionUF.union(5,7);
        unionUF.union(7,9);
        unionUF.union(3,9);
    }
}
