class Solution {
public:
    bool canPartition(vector<int>& nums) {
        int n=nums.size();
        long long sum=0;
        for(int i=0;i<n;i++){
                sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        long long m=sum/2;
        vector<vector<unsigned long long>>dp(n+1,vector<unsigned long long>(m+1,0));
        for(int i=0;i<=n;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    int ans = j-nums[i-1];
                    dp[i][j]= dp[i-1][j] + dp[i-1][ans];
                }
            }
        }
        return dp[n][m]>0;
    }
};