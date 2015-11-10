public class NumArray {
    private int[] acc;

    public NumArray(int[] nums) {
        for (int i = 1; i < nums.length; i++)
            nums[i] += nums[i - 1];
            
        acc = nums;
    }

    public int sumRange(int i, int j) {
        return i > 0 ? acc[j] - acc[i - 1] : acc[j]; 
    }
}

// Your NumArray object will be instantiated and called as such:
// NumArray numArray = new NumArray(nums);
// numArray.sumRange(0, 1);
// numArray.sumRange(1, 2);