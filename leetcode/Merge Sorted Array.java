class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n - 1;
        int nums1Len = m - 1;
        int nums2Len = n - 1;
        while ( nums1Len >= 0 && nums2Len >= 0){
            if(nums1[nums1Len] > nums2[nums2Len])
                nums1[length--] = nums1[nums1Len--];
            else
                nums1[length--] = nums2[nums2Len--];
        }
        if(nums2Len >= 0) {
            while(nums2Len >= 0)
                nums1[length--] = nums2[nums2Len--];
        } else 
            return;
    }
}
