import java.util.*;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        // Step 1: Sort the array
        Arrays.sort(nums);

        // Initialize closest sum
        int closest = nums[0] + nums[1] + nums[2];

        // Step 2: Fix one element
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            // Step 3: Two pointer approach
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // Update closest if needed
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                // Move pointers
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    // Exact match found
                    return sum;
                }
            }
        }
        return closest;
    }
}
