class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] s = new long[n];
        for (int i = 0; i < n; i++) {
            s[i] = 1L * nums[i] * nums[i];
        }
        Arrays.sort(s);
        long ans = 0;
        int num= (n%2 == 0)?n/2:n/2+1;
        for (int i = n-1; i >= 0; i--) {
            if(num-- > 0){
               ans += s[i];
            }
            else{
               ans -= s[i]; 
            }
        }
        return ans;
    }
}