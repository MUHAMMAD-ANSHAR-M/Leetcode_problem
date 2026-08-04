class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int a = nums1[0];
        int b = nums2[0];
        for(int i=1;i<nums1.length;i++){
            a = nums1[i]<a?nums1[i]:a;
            b = nums2[i]<b?nums2[i]:b;
        }
        return b-a;
    }
}