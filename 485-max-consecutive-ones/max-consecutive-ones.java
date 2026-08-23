class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curCount=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                curCount++;
                maxCount=Math.max(curCount,maxCount);
            }
            else curCount=0;
        }
        return maxCount;
    }
}