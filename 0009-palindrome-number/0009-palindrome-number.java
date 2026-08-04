class Solution {
    public boolean isPalindrome(int x) {
        char[] num = String.valueOf(x).toCharArray();
        int left = 0;
        int right =num.length-1;
        while(left<right){
            if(num[left]!=num[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}