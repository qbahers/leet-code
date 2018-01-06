class MedianOfTwoSortedArrays {
    
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int M = nums1.length;
        int N = nums2.length;
        
        if (M > N) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int lo = 0;
        int hi = M;
        
        while (lo <= hi) {
            int i = lo + (hi - lo) / 2;
            int j = (M + N - 1) / 2 - i;
            
            if (i < M && j > 0 && nums1[i] < nums2[j - 1]) {
                lo = i + 1;
            } else if (i > 0 && nums2[j] < nums1[i - 1]) {
                hi = i - 1;
            } else {
                if ((M + N) % 2 == 1) {
                    return i < M ? Math.min(nums1[i], nums2[j]) : nums2[j];
                } else {
                    int a = -1, b = -1;
                    if (i >= M) {
                        a = nums2[j];
                        b = nums2[j + 1];
                    } else if (nums1[i] < nums2[j]) {
                        a = nums1[i];
                        b = i + 1 < M ? Math.min(nums2[j], nums1[i + 1]) : nums2[j];
                    } else {
                        a = nums2[j];
                        b = j + 1 < N ? Math.min(nums1[i], nums2[j + 1]) : nums1[i];
                    }
                    return (a + b) / 2.0;
                }
            }
        }
        
        return -1;
    }
    
}