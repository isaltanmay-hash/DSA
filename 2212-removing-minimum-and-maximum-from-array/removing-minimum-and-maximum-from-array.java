class Solution {
    public int minimumDeletions(int[] nums) {
        int l = 0;
        int h = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[l]){
                l = i;
            }if(nums[i]>nums[h]){
                h = i;
            }
        }
        System.out.println(nums[l]);
        System.out.println(nums[h]);
        int res = Integer.MAX_VALUE;
        res = Math.min(res,Math.max(l,h)+1);
        res = Math.min(res,Math.max(nums.length-l,nums.length-h));
        if(l<h){
            res = Math.min(res,l+1+(nums.length-h));
            
        }else{
            res = Math.min(res,h+1+(nums.length-l));
        }
        return res;
    }
}