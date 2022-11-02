package com.jago.suanfa.algorithms.chap04;

import java.util.Stack;

public class DepthFirstSearch {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;
    private int count;

    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.v()];
        edgeTo = new int[G.v()];
        this.s = s;
        dfs(G,s);
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        count++;
        for (int w:G.adj(v)){
            if (!marked[w]){
                edgeTo[w] = v;
                dfs(G,w);
            }
        }
    }

    public boolean marked(int w){
        return marked[w];
    }

    public int count(){
        return count;
    }

    public boolean hasPathTo(int v){
        return  marked[v];
    }

    public Iterable<Integer> pathTo(int v){
        if (!hasPathTo(v)) return null;
        Stack<Integer> path = new Stack<>();
        for (int x = v; x != s ; x = edgeTo[x]) {
            path.push(x);
        }
        path.push(s);
        return path;
    }
}
