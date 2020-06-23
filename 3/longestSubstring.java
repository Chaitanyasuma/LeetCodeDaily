//Very high time complexity!!
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0)
            return 0;
        if (s.length() == 1) 
            return 1;
        
        int start = 0;
        ArrayList<Character> arr = new ArrayList<Character>();
        int end = start + 1;
        int count = 1;
        int max = 0;
        arr.add(s.charAt(start));
        while (end < s.length()) {
            if (arr.contains(s.charAt(end))) {
                start++;
                end = start + 1;
                arr.clear();
                arr.add(s.charAt(start));
                if (count > max) {
                    max = count;
                }
                count = 1;
            }
            else {
                arr.add(s.charAt(end));
                count++;
                end++;
                if (count > max) {
                    max = count;
                }
            }
        }
        return max;
    }
}