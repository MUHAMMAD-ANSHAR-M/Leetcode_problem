class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];
        int sum1=1;
        arr1[0]=1;
        arr2[nums.length-1]=1;
        int sum2=1;
        for(int i=1;i<nums.length;i++){
            sum1*=nums[i-1];
            arr1[i]=sum1;
        }
        for(int i=nums.length-2;i>=0;i--){
            sum2*=nums[i+1];
            arr2[i]=sum2;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr1[i]*arr2[i];
        }
        return nums;
    }
}