//by using cycle sort technique
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==i+1){
                i++;
            }
            else{
                int idx=nums[i]-1;
                int temp=nums[i];
                nums[i]=nums[idx];
                nums[idx]=temp;
                if(nums[i]==nums[idx]) return nums[i];
            }
        }
        return -1;
    }
}