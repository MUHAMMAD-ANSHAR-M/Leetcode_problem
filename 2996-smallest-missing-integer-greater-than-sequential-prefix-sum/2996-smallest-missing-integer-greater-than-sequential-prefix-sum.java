class Solution {
    public int missingInteger(int[] nums) {
        int a = nums[0];
        int sum = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != a) break;
            sum += nums[i];
            a++;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        while (set.contains(sum)) {
            sum++;
        }
        return sum;
    }
}