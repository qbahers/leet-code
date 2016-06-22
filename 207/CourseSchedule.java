public class CourseSchedule {
    private boolean[] marked;
    private boolean[] onStack;
    private Map<Integer, List<Integer>> adj;
    private boolean hasCycle;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        marked  = new boolean[numCourses];
        onStack = new boolean[numCourses];
        
        adj = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < prerequisites.length; i++) {
            int v = prerequisites[i][1];
            int w = prerequisites[i][0];
            
            List<Integer> l = adj.containsKey(v) ? adj.get(v) : new ArrayList<Integer>();
            l.add(w);
            adj.put(v, l);
        }
        
        for (int course = 0; course < numCourses; course++) {
            dfs(course);
            
            if (hasCycle) return false;
        }
        
        return true;
    }
    
    private void dfs(int course) {
        marked[course]  = true;
        onStack[course] = true;
        
        if (adj.containsKey(course)) {
            for (int v : adj.get(course)) {
                if (!marked[v]) {
                    dfs(v);
                }
                else if (onStack[v]) {
                    hasCycle = true;
                }
            }
        }
        
        onStack[course] = false;
    }
    
}