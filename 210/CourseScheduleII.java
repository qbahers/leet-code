public class CourseScheduleII {
    private boolean[] marked;
    private boolean[] onStack;
    private boolean hasCycle;
    Map<Integer, List<Integer>> adj;
    private Stack<Integer> reversePostorder = new Stack<Integer>();
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        marked  = new boolean[numCourses];
        onStack = new boolean[numCourses];
        
        adj = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            int v = prerequisites[i][1];
            int w = prerequisites[i][0];
            
            List l = adj.containsKey(v) ? adj.get(v) : new ArrayList<Integer>();
            l.add(w);
            adj.put(v, l);
        }
        
        for (int v = 0; v < numCourses; v++) {
            if (!marked[v]) dfs(v);
            
            if (hasCycle) return new int[0];
        }
        
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = reversePostorder.pop();
        }
        
        return res;
    }
    
    private void dfs(int v) {
        marked[v]  = true;
        onStack[v] = true;
        
        if (adj.containsKey(v)) {
            for (int w : adj.get(v)) {
                if (!marked[w]) {
                    dfs(w);
                }
                else if (onStack[w]) {
                    hasCycle = true;
                }
            }
        }
        reversePostorder.push(v);
        
        onStack[v] = false;
    }
    
}