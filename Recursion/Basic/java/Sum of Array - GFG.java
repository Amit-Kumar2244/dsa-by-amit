class Solution {
    // Recursive helper function
    public int sum(int[] arr, int n) {
        if (n <= 0)
            return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    public int arraySum(int[] arr) {
        int n = arr.length;
        return sum(arr, n);
    }
}