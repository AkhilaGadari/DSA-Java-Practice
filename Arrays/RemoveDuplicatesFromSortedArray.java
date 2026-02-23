// Problem: Remove Duplicates from Sorted Array
// Platform: LeetCode (26)
// Pattern: Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(1)


class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        for(int r=1;r<nums.length;r++)
        {
            if(nums[l]!=nums[r])
            {
                l++;
                nums[l]=nums[r];
            }
        }
        return l+1;
    }
}



