// LEET CODE 46 - PERMUTATIONS
// QUESTION LINK - https://leetcode.com/problems/permutations/

import java.util.*;

class Solution {
    public void equalSubset(List<Integer> nums, List<List<Integer>> res, List<Integer> temp) {
        if (temp.size() == nums.size()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.size(); i++) {
            if (temp.contains(nums.get(i))) continue;

            temp.add(nums.get(i));
            equalSubset(nums, res, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> permute(int[] numsArray) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        for (int num : numsArray) nums.add(num);
        equalSubset(nums, res, new ArrayList<>());
        return res;
    }
}
