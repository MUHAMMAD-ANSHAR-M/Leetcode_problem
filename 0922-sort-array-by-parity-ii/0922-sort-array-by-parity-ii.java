class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int arr1[] = new int[nums.length/2];
        int arr2[] = new int[nums.length/2];
        int i =0 ,j=0;
        for(int num:nums){
            if(num%2==0){
                arr1[i]=num;
                i++;
            }
            else{
                arr2[j]=num;
                j++;
            }
        }
        i=0;
        j=0;
        for(int k=0;k<nums.length;k+=2){
            nums[k]=arr1[i++];
            nums[k+1]=arr2[j++];
        }
        return nums;
    }
}