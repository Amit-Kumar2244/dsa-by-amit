// LEET CODE 22 - GENERATE PARENTHESIS
// QUESTION LINK - https://leetcode.com/problems/generate-parentheses/

import java.util.*;

class Solution {
    public void validParenthesis(List<String> res, int n, String temp, int open, int close) {
        if (open < n) {
            validParenthesis(res, n, temp + "(", open + 1, close);
        }
        if (open > close) {
            validParenthesis(res, n, temp + ")", open, close + 1);
        }
        if (open == n && close == n) {
            res.add(temp);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        validParenthesis(res, n, "", 0, 0);
        return res;
    }
}
