/**
 * Time:  O(n)
 * Space: O(1)
 */

public class SingleNumber {
    
    public int singleNumber(int[] nums) {
        int res = 0;
        
        for (int i = 0; i < nums.length; i++)
            res ^= nums[i];
            
        return res;
    }
    
}

/**
 * Time:  O(n)
 * Space: O(n)
 */

 public class SingleNumber {
    
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++)
            if (!set.remove(nums[i]))
                set.add(nums[i]);
        
        return (int) set.toArray()[0];
    }
    
}