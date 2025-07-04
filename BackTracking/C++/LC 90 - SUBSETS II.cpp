// LEET CODE 90 - SUBSETS II
// QUESTION LINK - https://leetcode.com/problems/subsets-ii/

class Solution {
public:
    void handleDup(vector<int>& nums, vector<vector<int>>& res, int start, vector<int>& temp)
    {
        res.push_back(temp);

        for(int i = start; i < nums.size(); i++)
        {
            if(i > start && nums[i] == nums[i - 1]) continue;
            temp.push_back(nums[i]);
            handleDup(nums, res, i + 1, temp);
            temp.pop_back();
        }
    }

    vector<vector<int>> subsetsWithDup(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> temp;
        sort(nums.begin(), nums.end());
        handleDup(nums, res, 0, temp);
        return res;
    }
};
