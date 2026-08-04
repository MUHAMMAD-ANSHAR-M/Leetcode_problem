class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int a = 1;
        for (int num : nums) {
            if (num < a) {      
                continue;
            }
            if (num == a) {
                a++;
            } else {           
                break;
            }
        }
        return a;
    }
}