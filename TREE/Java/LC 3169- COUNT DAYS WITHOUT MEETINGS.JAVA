// LEETCODE 3169 - COUNT DAYS WITHOUT MEETINGS
// QUESTION LINK - "https://leetcode.com/problems/count-days-without-meetings/"

import java.util.*;

class Solution {
    public int countDays(int days, int[][] meetings) {
        int freeDays = 0, prevEnd = 0;
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));
        for (int[] m : meetings) {
            int s = m[0], e = m[1];
            if (s > prevEnd) freeDays += s - prevEnd - 1;
            prevEnd = Math.max(prevEnd, e);
        }
        return freeDays + Math.max(0, days - prevEnd);
    }
}
