package com.jago.suanfa.algorithms.chap04;

public class TwoColor {
    private boolean[] marked;
    private boolean[] color;
    private boolean isTwoColorable = true;
    // v[]      0 1 2 3 4 5 6
    // markd    t t f t f f f
    // color    f t f f f f f
    public TwoColor(Graph G){
        marked = new boolean[G.v()];
        color = new boolean[G.v()];
        for (int s = 0; s < G.v(); s++) {
            //0

            if (!marked[s]){
                dfs(G,s);
            }
        }
    }

    private void dfs(Graph G, int v) {
        //0(1,2)
        //1(0,3)
        //3(2,4,5)
        marked[v] = true;
        for(int w:G.adj(v)){
            if (!marked[w]){
                //1(0,3)
                //相邻顶点染色和本顶点不一样
                color[w] = !color[v];
                dfs(G,w);
            }else if (color[w] == color[v]){
                //相邻顶点和本顶点染色一致，则不是二分图
                isTwoColorable = false;
            }
        }
    }

    public boolean isBipartite(){
        return isTwoColorable;
    }
}
