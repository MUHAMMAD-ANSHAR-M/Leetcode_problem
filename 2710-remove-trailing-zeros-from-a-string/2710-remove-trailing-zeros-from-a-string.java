class Solution {
    public String removeTrailingZeros(String num) {
        StringBuffer sb = new StringBuffer(num);
        for(int i =sb.length()-1 ; i >= 0 ; i-- ){
            if( sb.charAt(i) == '0'){
                sb.deleteCharAt(i);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}