package org.example;

public class TwoSum2 {

    /*
        Time complexity  = O(n^2)
        space complexity = O(1)
     */
    public int[] bruteForceApproach(int[] nums, int target) {
        int n = nums.length;
        for(int i=0; i<n ;i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i]+nums[j] == target) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        return new int[2];
    }

    /*
        Time complexity  = O(n)
        Space complexity = O(1)
     */
    public int[] twoSum(int[] nums, int target) {

        // initialize two pointers
        int left = 0;
        int right = nums.length - 1;

        // start two pointers iteration
        while(left < right) {
            int sum = nums[left] + nums[right];
            if(sum == target) {
                return new int[]{left, right};
            } else if(sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[2];
    }

}
