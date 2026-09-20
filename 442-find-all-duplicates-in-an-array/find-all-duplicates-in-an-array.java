//by freaquency array
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int[] freq=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]>1){
                al.add(i+1);
            }
        }
        return al;
    }
}