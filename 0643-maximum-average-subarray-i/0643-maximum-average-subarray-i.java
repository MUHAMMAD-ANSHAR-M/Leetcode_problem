class Solution {
    public double findMaxAverage(int[] nums, int k) {
         int arr[] = new int[nums.length - k +1];
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxsum = Integer.MIN_VALUE;
        while(right < nums.length){
            sum += nums[right];
            if((right - left) +1 == k ){
                maxsum = Math.max(sum , maxsum);
                sum -= nums[left];
                left++;
            }
            right++;
        }
        return (double) maxsum/k;
    }
}