// LEET CODE 1011 - CAPACITY TO SHIP PACKAGES WITHIN D DAYS
// QUESTION LINK - https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/

bool Function(vector<int>& arr,int n, int d, int mid)
    {
        int sum=0,day=1;
        for(int i=0;i<n;i++)
        {
            if(sum+arr[i]<=mid)
            {
                sum+=arr[i];
            }
            else
            {
                day++;
                sum=arr[i];
            }
        }
        if(day<=d) return true;
        return false;
    }
    int shipWithinDays(vector<int>& weights, int days)
    {
        int sum=0;
        int max=weights[0];
        int ans;
        for(int i=0;i<weights.size();i++)
        {
            if(weights[i]>max)
            {
                max = weights[i];
            }
            sum+=weights[i];
        }
        // cout<<max<<sum;
        int low = max;
        int high = sum;
        while(low<=high)
        {
            int mid = (low+high)/2;
            // cout<<k;
            if(Function(weights,weights.size(),days,mid))
            {
                ans = mid;
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return ans;

    }
