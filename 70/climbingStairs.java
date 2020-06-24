class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n];
        return climb(n, memo);
    }
    public int climb(int n, int[] memo) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1; //there's only one way of getting to step 1
        if (n == 2)
            return 2;
        if (memo[n - 1] == 0) { //not yet calculated
            memo[n - 1] = climb(n - 1, memo) + climb(n - 2, memo);
        }
        return memo[n - 1];
    }
}