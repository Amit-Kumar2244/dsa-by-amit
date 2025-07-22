# LEETCODE 3169 - COUNT DAYS WITHOUT MEETINGS
# QUESTION LINK - "https://leetcode.com/problems/count-days-without-meetings/"

class Solution:
    def countDays(self, days: int, meetings: list[list[int]]) -> int:
        free = 0
        prev = 0
        for s, e in sorted(meetings):
            if s > prev:
                free += s - prev - 1
            prev = max(prev, e)
        return free + max(0, days - prev)
