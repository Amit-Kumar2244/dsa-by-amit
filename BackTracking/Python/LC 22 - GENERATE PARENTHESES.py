# LEET CODE 22 - GENERATE PARENTHESIS
# QUESTION LINK - https://leetcode.com/problems/generate-parentheses/

class Solution:
    def generateParenthesis(self, n: int) -> list[str]:
        res = []

        def validParenthesis(temp: str, open_: int, close: int):
            if open_ < n:
                validParenthesis(temp + "(", open_ + 1, close)
            if open_ > close:
                validParenthesis(temp + ")", open_, close + 1)
            if open_ == n and close == n:
                res.append(temp)

        validParenthesis("", 0, 0)
        return res
