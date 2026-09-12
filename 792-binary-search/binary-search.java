//using recursion
class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int[] arr,int search,int low, int high) {
        if(low>high)return -1;
        int mid=low+(high-low)/2;

        if(arr[mid]==search)return mid;

        else if(arr[mid]>search) return helper(arr,search,low,mid-1);

        else return helper(arr,search,mid+1,high);
    }
}