class Solution {
    public int reverseDegree(String s) {
        int count  = 0;
        for(int i = 0; i < s.length(); i++){
            int ReverseValue = 26  - (s.charAt(i) - 'a');
            count += ReverseValue * (i+1);
        }
        return count;
    }
}