/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class MergeIntervals {
    
    public List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> res = new LinkedList<Interval>();
        
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval a, Interval b) {
                return Integer.compare(a.start, b.start);
            }
        });
        
        for (Interval interval : intervals) {
            if (res.isEmpty() || interval.start > res.getLast().end) {
                res.add(interval);
            } else {
                res.getLast().end = Math.max(res.getLast().end, interval.end);
            }
        }
        
        return res;
    }
    
}
