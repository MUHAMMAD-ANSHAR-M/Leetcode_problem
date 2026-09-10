class Solution {
    public int mirrorDistance(int n) {
        int num = n;
        int rev = 0;
        while(n != 0){
            int nums = n % 10;
            rev = (rev*10) + nums;
            n /= 10;
        }
        return Math.abs(num - rev);
    }
}