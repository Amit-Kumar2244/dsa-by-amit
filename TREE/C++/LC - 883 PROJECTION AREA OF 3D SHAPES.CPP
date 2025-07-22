// LeetCode 883 - Projection Area of 3D Shapes
// https://leetcode.com/problems/projection-area-of-3d-shapes/

class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
        int n = grid.size(), m = grid[0].size();
        int xy = 0, yz = 0, zx = 0;
        for (int i = 0; i < n; i++) {
            int mx = 0;
            for (int j = 0; j < m; j++) {
                if (grid[i][j]) xy++;
                mx = max(mx, grid[i][j]);
            }
            zx += mx;
        }
        for (int j = 0; j < m; j++) {
            int mx = 0;
            for (int i = 0; i < n; i++) {
                mx = max(mx, grid[i][j]);
            }
            yz += mx;
        }
        return xy + yz + zx;
    }
};
