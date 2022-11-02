package com.jago.suanfa.algorithms.chap04;

public class DirectedDFS {
    private boolean[] marked;
    public DirectedDFS(AT153_DigGraph G, int s){
        marked = new boolean[G.V()];
        dfs(G,s);
    }

    public DirectedDFS(AT153_DigGraph G, Iterable<Integer> sources){
        marked = new boolean[G.V()];
        for(int s : sources){
            if (!marked[s]) dfs(G,s);
        }
    }

    private void dfs(AT153_DigGraph G, int v) {
        marked[v] = true;
        for(int w : G.adj(v)){
            if (!marked[w]){
                dfs(G,w);
            }
        }
    }

    public boolean marked(int v){
        return marked[v];
    }

    public static void main(String[] args) {
        AT153_DigGraph G = new AT153_DigGraph(6);

    }
}
