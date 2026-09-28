class Solution {
    public int maxDepth(String s) {
        int d = 0;
        int max_d = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                d++;
                max_d = Math.max(max_d, d);
            } else if (ch == ')') {
                d--;
            }
        }

        return max_d;
    }
}