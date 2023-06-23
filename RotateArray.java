package org.example;

public class RotateArray {

    /*
        Time Complexity = O(n)
        Space Complexity = O(n)
     */
    public void bruteForceRotate(int[] nums, int k) {
        // Initialize array length
        int n = nums.length;

        // initialize new array
        int[] result = new int[n];

        // create new array and update the values
        for (int i = 0; i < n; i++) {
            int newPos = (i + k) % n;
            result[newPos] = nums[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }
    }

    /*
        Time Complexity = O(n)
        Space Complexity = O(1)
     */
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k % n == 0)
            return;
        k = k % (n);
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public void reverse(int[] nums, int pos1, int pos2) {
        while (pos1 < pos2) {
            int temp = nums[pos1];
            nums[pos1] = nums[pos2];
            nums[pos2] = temp;
            pos1++;
            pos2--;
        }
    }
}
