public class ContainsDuplicateIII {
    
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i - k - 1 >= 0) treeMap.remove(nums[i - k - 1]);
            
            Integer c = treeMap.ceilingKey(nums[i]);
            Integer f = treeMap.floorKey(nums[i]);
            
            if (c != null && (long) c - nums[i] <= t) return true;
            if (f != null && (long) nums[i] - f <= t) return true;
            
            treeMap.put(nums[i], i);
        }
        
        return false;
    }
    
}