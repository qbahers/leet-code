public class CompareVersionNumbers {
    
    public int compareVersion(String version1, String version2) {
        String[] a1 = version1.split("\\.");
        String[] a2 = version2.split("\\.");
        
        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        
        for (String s : a1)
            q1.add(Integer.parseInt(s));
            
        for (String s : a2)
            q2.add(Integer.parseInt(s));
            
        return compare(q1, q2);
    }
    
    private int compare(Queue<Integer> q1, Queue<Integer> q2) {
        if (q1.isEmpty() && q2.isEmpty()) {
            return 0;
        }
        else if (q1.isEmpty()) {
            return (q2.poll() == 0) ? compare(q1, q2) : -1;
        }
        else if (q2.isEmpty()) {
            return (q1.poll() == 0) ? compare(q1, q2) : 1;
        }
        else {
            int num1 = q1.poll();
            int num2 = q2.poll();
            
            return (num1 == num2) ? compare(q1, q2) : (num1 < num2) ? -1 : 1;
        }
    }
    
}