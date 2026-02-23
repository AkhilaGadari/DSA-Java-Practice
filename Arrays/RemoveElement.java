// Problem: Remove Element
// Platform: LeetCode
// Pattern: Two Pointers (Slow & Fast)
// Technique: In-place overwrite
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int removeElement(int[] nums, int val) {
        int l=0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]!=val)
            {
             nums[l]=nums[r];
             l++;   
            }
        }
        return l;
    }
}
