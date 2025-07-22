// LEETCODE 3169 - COUNT DAYS WITHOUT MEETINGS
// QUESTION LINK - "https://leetcode.com/problems/count-days-without-meetings/"

class Solution {
public:
    int countDays(int days, vector<vector<int>>& meetings) {
        int freeDays = 0, prevEnd = 0;
        sort(meetings.begin(), meetings.end());
        for (auto &mt : meetings) {
            int s = mt[0], e = mt[1];
            if (s > prevEnd) freeDays += s - prevEnd - 1;
            prevEnd = max(prevEnd, e);
        }
        return freeDays + max(0, days - prevEnd);
    }
};
