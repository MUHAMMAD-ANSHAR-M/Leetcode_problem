class Solution {
    public boolean isPalindrome(String s) {
        String a = s.replaceAll("[^a-zA-Z0-9]", "");
        a=a.toLowerCase();
        char[] b = a.toCharArray();
        int left = 0;
        int right = b.length-1;
        while(left<right){
            if(b[left]!=b[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}