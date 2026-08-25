class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[]=new int[2];
        int j=0;
        int i=0;
        Arrays.sort(nums);
        while(i<nums.length){
            if(i==nums.length-1||nums[i]!=nums[i+1]){
                arr[j]=nums[i];
                j++;
                i++;
            }
            else if(nums[i]==nums[i+1])i+=2;
        }
        return arr;
    }
}