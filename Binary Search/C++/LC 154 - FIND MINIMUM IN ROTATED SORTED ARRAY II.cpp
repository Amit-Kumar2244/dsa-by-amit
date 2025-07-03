
// LEET CODE 154 - FIND MINIMUM IN ROTATED SORTED ARRAY II
// QUESTION LINK - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/


int findMin(vector<int>& nums) {
        int low=0;
        int high=nums.size()-1;

        while(low<high)
        {
            int mid = (low+high)/2;
            if(nums[mid]>nums[high])
            {
                low=mid+1;
            }
	    else if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
            }
            else
            {
                high=mid;
            }
            
        }
        return nums[low];
    }
