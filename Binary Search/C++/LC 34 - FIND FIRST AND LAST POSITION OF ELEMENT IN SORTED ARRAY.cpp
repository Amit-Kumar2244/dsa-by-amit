// LEET CODE 34 - FIND FIRST AND LAST POSITION OF ELEMENT IN SORTED ARRAY.
// QUESTION LINK - https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

int FirstOccurrence(vector<int> arr, int target)
    {
        int ans =-1;
        int low =0;
        int high = arr.size()-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==target)
            {
                ans = mid;
                high=mid-1;
            }
            else if(arr[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    int LastOccurrence(vector<int> arr, int target)
    {
        int ans =-1;
        int low =0;
        int high = arr.size()-1;

        while(low<=high)
        {
            int mid = (low+high)/2;

            if(arr[mid]==target)
            {
                ans = mid;
                low=mid+1;
            }
            else if(arr[mid]>target)
            {
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return ans;
    }
    vector<int> searchRange(vector<int>& nums, int target)
    {
        vector<int> result;
        result.push_back(FirstOccurrence(nums,target));
        result.push_back(LastOccurrence(nums,target));
        return result;
    }
