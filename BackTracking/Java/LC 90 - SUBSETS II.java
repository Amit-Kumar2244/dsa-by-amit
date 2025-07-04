// LEET CODE 90 - SUBSETS II
// QUESTION LINK - https://leetcode.com/problems/subsets-ii/

import java.util.*;

class Solution {
    public void handleDup(int[] nums, List<List<Integer>> res, int start, List<Integer> temp) {
        res.add(new ArrayList<>(temp));

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            handleDup(nums, res, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        handleDup(nums, res, 0, new ArrayList<>());
        return res;
    }
}
