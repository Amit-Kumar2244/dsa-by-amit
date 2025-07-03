// LEET CODE 69 - SQUARE ROOT
// Question Link - https://leetcode.com/problems/sqrtx/description/

int mySqrt(int x) {
        if(x==0) return 0;
        int long low = 1;
        int long high = x/2;
        int long mid=(low+high)/2;
        int long sol=1;

        while(low<=high)
        {
            mid=(low+high)/2;
            if(mid*mid==x)
            {
                return mid;
            }
            else if(mid*mid>=x)
            {
                high = mid-1;
            }
            else
            {
                sol=mid;
                low=mid+1;
            }
        }
        return sol;

    }