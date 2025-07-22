# LeetCode 883 - Projection Area of 3D Shapes
# https://leetcode.com/problems/projection-area-of-3d-shapes/

class Solution:
    def projectionArea(self, grid):
        n, m = len(grid), len(grid[0])
        xy = zx = yz = 0
        for i in range(n):
            mx = 0
            for j in range(m):
                if grid[i][j] > 0: xy += 1
                mx = max(mx, grid[i][j])
            zx += mx
        for j in range(m):
            mx = 0
            for i in range(n):
                mx = max(mx, grid[i][j])
            yz += mx
        return xy + yz + zx
