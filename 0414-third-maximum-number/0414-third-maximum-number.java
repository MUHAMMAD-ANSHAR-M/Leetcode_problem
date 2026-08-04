import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums[nums.length-1];
        int a=1;
        for (int i= nums.length-1;i>=0;i--){
            if ( n > nums[i]){
                a++;
                n = nums[i];
            }
            if (a==3) 
             return n;
        }
        return nums[nums.length-1];
    }
}