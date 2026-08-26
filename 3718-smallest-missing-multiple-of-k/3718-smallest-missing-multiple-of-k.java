class Solution {
    public int missingMultiple(int[] nums, int k) {
        int min = k;
        while (true) {
            boolean found = false;
            for (int num : nums) {
                if (num == min) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return min;
            }
            min += k;
        }
    }
}