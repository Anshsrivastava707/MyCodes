class Solution {
    private int graph[][];
    private boolean visited[];
    public int findCircleNum(int[][] isConnected) {
        graph=isConnected;
        int n=graph.length;
        visited=new boolean[n];
        int procount=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                helper(i);
                procount++;
            }
        }
        return procount;
    }
    private void helper(int city){
        visited[city]=true;
        
        for(int i=0;i<graph.length;i++){
            if(!visited[i] && graph[city][i]==1){
                helper(i);
            }
        }
    }
}