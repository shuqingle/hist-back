package com.jago.suanfa.algorithms.chap04;

import java.util.Iterator;

public  class Graph {
    /**
     * 顶点数量
     */
   private final int V;
    /**
     * 边数量
     */
   private int E;

   private Bag<Integer> [] adj;

    /**
     * 带顶点数量的图构造函数
     * @param V
     */
    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<Integer>();
        }
    }

    /**
     * 返回顶点数量
     * @return
     */
    int v(){
        return V;
    }

    /**
     * 返回边的数量
     * @return
     */
    int e(){
        return E;
    }

    /**
     * 向图中添加v-w的边
     * @param v
     * @param w
     */
    void addEdge(int v,int w){
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    /**
     * 和v相邻的所有顶点
     * @param v
     * @return
     */
     Iterable<Integer> adj(int v){
         return adj[v];
     };



    /**
     * 计算顶点v的度数
     * @param G
     * @param v
     * @return
     */
    public static int degree(Graph G,int v){
        int degree = 0;
        for(int w : G.adj(v)){
            degree++;
        }
        return degree;
    }

    /**
     * 计算所有顶点的最大度数
     * @param G
     * @return
     */
    public static int maxDegree(Graph G){
        int max = 0;
        for (int v = 0; v < G.v(); v++) {
            if (degree(G,v) > max){
                max = degree(G,v);
            }
        }
        return max;
    }

    /**
     * 计算所有顶点的平均深度
     * @param G
     * @return
     */
    public static double avgDegree(Graph G){
        return 2.0 * G.e() / G.v();
    }

    /**
     * 计算自闭环的个数
     * @param G
     * @return
     */
    public static int numberOfSelfLoops(Graph G){
        int count = 0;
        for (int v = 0; v < G.v(); v++) {
            for(int w : G.adj(v)){
                if (v == w){
                    count++;
                }
            }
        }
        return count/2;
    }

    @Override
    public String toString() {
        String s = V + " vertices, "+E+" edges\n";
        for (int v = 0; v < V; v++) {
            s += v+": ";
            for(int w : this.adj(v)){
                s += w+ " ";
            }
            s += "\n";
        }
        return s;
    }

    private class Bag<T> implements Iterable<T>{
        void add(T t){

        };

        @Override
        public Iterator<T> iterator() {
            return null;
        }
    }
}
