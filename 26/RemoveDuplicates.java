class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueElements = 0;
        //int index = 0;
        List<Integer> visited = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (! visited.contains(nums[i])) {
                visited.add(nums[i]);
                //index++;
            }
        }
        for (int i = 0; i < visited.size(); i++) {
            nums[i] = visited.get(i);
        }
        return visited.size();
    }
}