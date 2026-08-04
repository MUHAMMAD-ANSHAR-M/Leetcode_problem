class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a = nums.length;
        return (nums[a-1]*nums[a-2])-(nums[0]*nums[1]);
    }
}