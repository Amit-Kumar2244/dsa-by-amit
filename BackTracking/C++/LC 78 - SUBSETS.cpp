// LEET CODE 78 - SUBSETS
// QUESTION LINK - https://leetcode.com/problems/subsets/

class Solution {
public:
    void possibleSubsets(vector<int>& nums, int start, vector<int>& temp, vector<vector<int>>& res)
    {
        res.push_back(temp);

        for(int i = start; i < nums.size(); i++)
        {
            temp.push_back(nums[i]);
            possibleSubsets(nums, i + 1, temp, res);
            temp.pop_back();
        }
    }

    vector<vector<int>> subsets(vector<int>& nums) 
    {
        vector<vector<int>> res;
        vector<int> ans;
        possibleSubsets(nums, 0, ans, res);
        return res;
    }
};
