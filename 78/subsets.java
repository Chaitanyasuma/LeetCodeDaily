class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        rec(new ArrayList<Integer>(), finalList, nums, 0);
        return finalList;
    }
    
    public void rec(List<Integer> list, List<List<Integer>> finalList, int[] nums, int start) {
        System.out.println(list);
        finalList.add((list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            rec(list, finalList, nums, i + 1);
            list.remove(list.size() - 1); //keep removing latest added element after it has been explored i.e. backtrack
        }
    }
}