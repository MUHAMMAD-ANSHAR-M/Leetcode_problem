class Solution {
    public int lengthOfLastWord(String s) {
     String[] words = s.split(" ");   
     String a = words[words.length-1];
     char[] arr = a.toCharArray();
     return arr.length;
    }
}