class Solution {
    int max;
    int start;
    public String longestPalindrome(String s) {
        //find all palindromes and update max length
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            findPalindrome(s, i , i); //i.e. odd length palindrome, i acts as centre
            findPalindrome(s, i, i + 1);
        }
        //System.out.println(start + " " + end);
        return s.substring(start, start + max);
    }
    
    public void findPalindrome(String s, int i, int j) {
        // i is lower bound, and j is upper bound
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (max < (j - i - 1)) {
            max = j - i - 1; //because i has decremented one extra time and j has incremented one extra time
            start = i + 1;
        }
    }
}