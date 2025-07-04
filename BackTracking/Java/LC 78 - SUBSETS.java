// LEET CODE 78 - SUBSETS
// QUESTION LINK - https://leetcode.com/problems/subsets/

import java.util.*;

class Solution {
    public void possibleSubsets(int[] nums, int start, List<Integer> temp, List<List<Integer>> res) {
        res.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            possibleSubsets(nums, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        possibleSubsets(nums, 0, new ArrayList<>(), res);
        return res;
    }
}
