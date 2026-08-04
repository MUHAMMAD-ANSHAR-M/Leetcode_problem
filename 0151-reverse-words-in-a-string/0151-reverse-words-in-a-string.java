class Solution {
    public String reverseWords(String s) {
        String arr[] = s.trim().split("\\s+");
        int left =0 , right = arr.length-1;
        while(left<right){
            String a=arr[left];
            arr[left]=arr[right];
            arr[right]=a;
            left++;
            right--;
        }
        return String.join(" ", arr);
    }
}