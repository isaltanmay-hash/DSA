class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> al=new ArrayList<>();
        int[] freq=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]-1]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[i]==0){
                al.add(i+1);
            }
        }
        return al;
    }
}