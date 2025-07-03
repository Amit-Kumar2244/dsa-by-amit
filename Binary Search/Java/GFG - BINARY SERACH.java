// GFG - Binary Search (Find First Occurrence)
// QUESTION LINK - https://www.geeksforgeeks.org/problems/binary-search-1587115620/1

class Solution {
    int binarysearch(int arr[], int k) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == k) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
