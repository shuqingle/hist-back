package com.jago.suanfa.algorithms.chap04;

public class CC {
    private boolean[] marked;
    private int [] id;
    private int count;

    public CC(Graph G) {
        //mark t t f f f f
        //id   0 0 0 0 0 0
        //v[]  0 1 2 3 4 5
        marked = new boolean[G.v()];//6
        id = new int[G.v()];//6
        for (int s = 0; s < G.v(); s++) {
            if (!marked[s]){
                dfs(G,s);
                count++;
            }
        }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for(int w : G.adj(v)){
            if (!marked[w]){
                dfs(G,w);
            }
        }
    }

    public boolean connected(int v,int w){
        return id[v] == id[w];
    }

    public int id(int v){
        return id[v];
    }

    public int count(){
        return count;
    }


}
