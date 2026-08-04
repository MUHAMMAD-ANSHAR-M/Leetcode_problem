class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int max2 = 0;
        while(n!=0){
            int num = n%10;
            if(num>=max){
                max2=max;
                max=num;
            }
            else if(num>max2){
                max2=num;
            }
            n/=10;
        }
        return max*max2;
    }
}