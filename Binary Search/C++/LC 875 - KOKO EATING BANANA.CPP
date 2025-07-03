// LEET CODE 875 - KOKO EATING BANANAS
// QUESTION LINK - https://leetcode.com/problems/koko-eating-bananas/description/

bool eating(vector<int>& arr,int n, int h, long speed)
    {
        long s=0;
        for(int i=0;i<n;i++)
        {
            int k = ceil((double)arr[i]/speed);
                s+=k;
        }
        if(s<=h) return true;
        return false;
    }
    int minEatingSpeed(vector<int>& piles, int h) 
    {
        int max = piles[0];
        int n=piles.size();
        int ans;
        for(int i=0;i<n;i++)
        {
            if(piles[i]>max)
            {
                max = piles[i];
            }
        }

        int low = 1;
        int high = max;

        while(low<=high)
        {
            long mid = low + (high - low) / 2;
            if(eating(piles,n,h,mid))
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
