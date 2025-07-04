// LEET CODE 46 - PERMUTATIONS
// QUESTION LINK - https://leetcode.com/problems/permutations/

class Solution {
public:
    void equalSubset(vector<int>& nums, vector<vector<int>> &res, vector<int> temp)
    {
        if(temp.size() == nums.size())
        {
            res.push_back(temp);
            return;
        } 

        for(int i = 0; i < nums.size(); i++)
        {
            if(find(temp.begin(), temp.end(), nums[i]) != temp.end()) continue;

            temp.push_back(nums[i]);
            equalSubset(nums, res, temp);
            temp.pop_back();
        }
    }

    vector<vector<int>> permute(vector<int>& nums) {
        vector<vector<int>> res;
        vector<int> temp;
        equalSubset(nums, res, temp);
        return res;
    }
};
