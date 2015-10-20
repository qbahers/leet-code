public class MergeSortedArray {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] aux = new int[m + n];
        
        int i = 0, j = 0;
        
        for (int k = 0; k < m + n; k++) {
            if      (i >= m)              aux[k] = nums2[j++];
            else if (j >= n)              aux[k] = nums1[i++];
            else if (nums1[i] < nums2[j]) aux[k] = nums1[i++];
            else                          aux[k] = nums2[j++];
        }
        
        for (int k = 0; k < m + n; k++)
            nums1[k] = aux[k];
    }
    
}