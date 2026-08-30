class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;
        int maxIndex = -1;
        for(int i= 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
                maxIndex = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minIndex = i;
            }
        }
        int left = Math.min(minIndex, maxIndex);
        int right = Math.max(minIndex, maxIndex);
        int fromLeft = right + 1;
        int fromRight = nums.length - left;
        int fromBoth = (left + 1) + (nums.length - right);
        return Math.min(fromLeft, Math.min(fromRight, fromBoth));
    }
}