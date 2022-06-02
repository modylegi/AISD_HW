package AISD_HW.RedundantConnection;

class Solution {
    int[] par;
    int[] rank;
    public int find(int X){
        if(par[X]==X){
            return X;
        }
        return par[X]=find(par[X]);
    }
    public void union(int X,int Y){
        int root1=find(X);
        int root2=find(Y);

        if(root1!=root2){
            int rank1=rank[root1];
            int rank2=rank[root2];
            if(rank1>rank2){
                par[root2]=root1;
            }else if(rank1<rank2){
                par[root1]=root2;
            }else{
                par[root2]=root1;
                rank[root1]++;
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        par=new int[edges.length+1];
        rank=new int[edges.length+1];
        for(int i=0;i<par.length;i++){
            par[i]=i;
        }
        for(int[] edge:edges){
            if(find(edge[0])==find(edge[1])){
                return edge;
            }
            union(edge[0],edge[1]);
        }
        return new int[2];
    }
}
