package org.example;

import java.util.HashMap;

public class TwoSum1 {

        /*
            Time Complexity = O(n^2)
            Space Complexity = O(1)
         */
        public int[] BruteForceApproach(int[] nums, int target) {
            int n = nums.length;
            for(int i=0; i<n; i++) {
                for(int j=i+1; j<n; j++) {
                    if(nums[i]+nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
            return new int[2];
        }

    /*
        Time Complexity = O(n)
        Space Complexity = O(n)
     */
    public int[] twoSum(int[] nums, int target) {

        // initialize hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(target-nums[0], 0);

        int n = nums.length;

        // process the array
        for(int i=1;i<n;i++) {
            if(map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            } else {
                map.put(target-nums[i], i);
            }
        }

        // return final output
        return new int[2];
    }


}
