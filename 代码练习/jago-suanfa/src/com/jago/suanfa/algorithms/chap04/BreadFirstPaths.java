package com.jago.suanfa.algorithms.chap04;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BreadFirstPaths {
    private boolean[] marked;
    private int [] edgeTo;
    private final int s;

    public BreadFirstPaths(Graph G, int s) {
        marked = new boolean[G.v()];
        edgeTo = new int[G.v()];
        this.s = s;
        bfs(G,s);
    }

    private void bfs(Graph G, int s) {
        Queue<Integer> queue = new ArrayDeque<>();
        marked[s] = true;
        queue.add(s);
        while (!queue.isEmpty()){
            int v = queue.poll();
            for(int w:G.adj(v)){
                if (!marked[w]){
                    edgeTo[w] = v;
                    marked[w] = true;
                    queue.add(w);
                }
            }
        }
    }

    public boolean hasPathTo(int v){
        return marked[v];
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
