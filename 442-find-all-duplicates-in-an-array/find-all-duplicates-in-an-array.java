import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int i = 0;
        
        // Step 1: Cyclic Sort Phase
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            
            // Swap only if the current number is not at its correct index
            // AND it is not a duplicate of the number already at that correct index
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                // Move forward if it's already in the right spot OR a duplicate is detected
                i++;
            }
        }
        
        // Step 2: Identification Phase
        // Any number not matching its index slot is a duplicate
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                al.add(nums[i]);
            }
        }
        
        return al;
    }
}
