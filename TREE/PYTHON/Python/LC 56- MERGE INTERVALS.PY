# LEETCODE 56 - MERGE INTERVALS
# QUESTION LINK - "https://leetcode.com/problems/merge-intervals/"

class Solution:
    def merge(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        if not intervals:
            return res

        intervals.sort()
        res.append(intervals[0])

        for i in range(1, len(intervals)):
            last = res[-1]
            if last[1] >= intervals[i][0]:
                last[1] = max(last[1], intervals[i][1])
            else:
                res.append(intervals[i])

        return res
