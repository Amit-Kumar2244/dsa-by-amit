// LEET CODE 22 - GENERATE PARENTHESIS
// QUESTION LINK - https://leetcode.com/problems/generate-parentheses/


class Solution {
public:
    void validParenthesis(vector<string> &res, int n, string temp,int open, int close)
    {
        if(open<n)
        {
            validParenthesis(res, n, temp+"(", open+1, close);
        }
        if(open>close)
        {
            validParenthesis(res, n, temp+")", open, close+1);
        }
        if(open==n && close==n)
            res.push_back(temp);

    }
    vector<string> generateParenthesis(int n)
    {
        vector<string> res;
        string temp;
        validParenthesis(res,n,temp,0,0);
        return res;
    }
};
