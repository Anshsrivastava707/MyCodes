import java.util.*;
class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
           adj.add(new ArrayList<>()); 
        }

        for(int edge[]:edges){
            int v=edge[0];
            int u=edge[1];

            adj.get(v).add(u);
            adj.get(u).add(v);
        }

        boolean visited[]=new boolean[n];
        Queue<Integer> q=new LinkedList<>();

        q.add(source);
        visited[source]=true;
        while(!q.isEmpty()){
            int node=q.poll();
            if(node==destination){
                return true;
            }
            for(int x:adj.get(node)){
                if(!visited[x]){
                    visited[x]=true;
                    q.add(x);
                }
            }
        }
        return false;
    }
}