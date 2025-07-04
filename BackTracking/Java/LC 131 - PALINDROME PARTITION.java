// LEET CODE 131 - PALINDROME PARTITIONING
// QUESTION LINK - https://leetcode.com/problems/palindrome-partitioning/

class Solution {
    public boolean isPalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }

    public void subStringPalindrome(List<List<String>> res, String s, List<String> temp, int start) {
        if (start == s.length()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                subStringPalindrome(res, s, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> temp = new ArrayList<>();
        subStringPalindrome(res, s, temp, 0);
        return res;
    }
}
