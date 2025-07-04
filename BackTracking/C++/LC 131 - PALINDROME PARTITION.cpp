// LEET CODE 131 - PALINDROME PARTITIONING
// QUESTION LINK - https://leetcode.com/problems/palindrome-partitioning/

class Solution {
public:
    bool IsPalindrome(string s, int low, int high) {
        while (low < high) {
            if (s[low] != s[high]) return false;
            low++;
            high--;
        }
        return true;
    }

    void subStringPalindrome(vector<vector<string>>& res, string s, vector<string>& temp, int start) {
        if (start == s.size()) {
            res.push_back(temp);
            return;
        }

        for (int i = start; i < s.size(); i++) {
            if (IsPalindrome(s, start, i)) {
                temp.push_back(s.substr(start, i - start + 1));
                subStringPalindrome(res, s, temp, i + 1);
                temp.pop_back();
            }
        }
        return;
    }

    vector<vector<string>> partition(string s) {
        vector<vector<string>> res;
        vector<string> temp;
        subStringPalindrome(res, s, temp, 0);
        return res;
    }
};
