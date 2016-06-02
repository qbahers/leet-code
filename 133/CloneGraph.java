/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */

public class CloneGraph {
    
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) return null;
        
        Map<Integer, UndirectedGraphNode> marked = new HashMap<Integer, UndirectedGraphNode>();
        UndirectedGraphNode res = new UndirectedGraphNode(node.label);
        
        dfs(marked, res, node);
        
        return res;
    }
    
    private void dfs(Map<Integer, UndirectedGraphNode> marked, UndirectedGraphNode res, UndirectedGraphNode node) {
        marked.put(node.label, res);
        
        for (UndirectedGraphNode neighbor : node.neighbors) {
            if (!marked.containsKey(neighbor.label)) {
                UndirectedGraphNode clone = new UndirectedGraphNode(neighbor.label);
                res.neighbors.add(clone);
                dfs(marked, clone, neighbor);
            }
            else {
                res.neighbors.add(marked.get(neighbor.label));
            }
        }
    }
    
}