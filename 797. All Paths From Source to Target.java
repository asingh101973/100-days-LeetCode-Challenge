class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new LinkedList(); //return ans
        List<Integer> current = new ArrayList();
        current.add(0);
        dfs(0, current, ans,graph, graph.length-1);
        return ans;
    }
    private void dfs(int src, List<Integer> current, List<List<Integer>> ans, int[][] graph, int dest){
        if(src == dest){
            ans.add(new ArrayList(current));
            return;
        }
        for(int i : graph[src]){
            current.add(i);
            dfs(i,current,ans,graph,dest);
            current.remove(current.size()-1);
        }
    }

}
