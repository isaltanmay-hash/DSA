class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] freq=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-1]++;
        }

        int[] ans=new int[2];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==2)break;
            if(freq[i]>1){
                ans[0]=i+1;
                count++;
            }
            if(freq[i]==0){
                ans[1]=i+1;
                count++;
            }
        }
        return ans;
    }
}