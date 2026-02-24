// Problem: Merge Sorted Array
// Platform: LeetCode (88)
// Pattern: Two Pointers + Insertion Fix
// Time Complexity: O(m * n)
// Space Complexity: O(1)

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

         if (n == 0) 
         {
            return;
         }
        for(int i=0;i<m;i++)
        {
            int j=0;
            int flag=0;
            if(nums1[i]>nums2[j])
            {
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
                flag=1;

            }
            if(flag==1)
            {
                int key=nums2[j];
                while(j<n-1 && nums2[j+1]<key)
                {
                    nums2[j]=nums2[j+1];
                    j++;
                    
                }
                nums2[j]=key;
            }
           
        }
         for(int i=m;i<m+n;i++)
            {
                nums1[i]=nums2[i-m];
            }
       

         
    } 
}
