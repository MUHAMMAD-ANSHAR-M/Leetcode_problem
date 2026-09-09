class Solution {
    public long countCommas(long n) {
        long res = 0;
        long cur = 1000;
        while(cur <= n){
            res += n - cur + 1;
            cur *= 1000;
        }
        return res;
    }
}