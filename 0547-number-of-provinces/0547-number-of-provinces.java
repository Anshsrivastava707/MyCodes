class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=isConnected.length;

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && i!=j){
                    adj.get(i).add(j);
                }
            }
        }

            boolean visited[]=new boolean[n];
            int provinces=0;

            for(int i=0;i<n;i++){
                if(!visited[i]){
                    provinces++;
                    dfs(i,adj,visited);
                }
            
            }            
            return provinces;
        }

        static void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean visited[]){
            visited[node]=true;

            for(int x:adj.get(node)){
                if(!visited[x]){
                    dfs(x,adj,visited);
                }
            }
        }
    }
