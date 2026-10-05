class Solution {
    public int scoreOfParentheses(String s) {
        int result = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                d++;
            } else {
                d--;
                if (s.charAt(i - 1) == '(') {
                    result += 1 << d;
                }
            }
        }

        return result;
    }
}