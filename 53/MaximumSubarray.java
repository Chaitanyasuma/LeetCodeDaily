class Solution {
    public int maxSubArray(int[] nums) {
        if (checkForAllNegative(nums) < 0) {
            return checkForAllNegative(nums);
        }
        int maxTillHere = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max += nums[i];
            if (max < 0) {
                max = 0;
            }
            maxTillHere = Math.max(maxTillHere, max);
        }    
        return maxTillHere;
    }
    
    public int checkForAllNegative(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return 0;
            }
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}