class Solution {
    public void backtrack(int[] nums, List<List<Integer>> res, List<Integer> adder) {
        if(adder.size() == nums.length) {
            res.add(new ArrayList<>(adder));
            return;
        }

        for(int i=0; i<nums.length; i++) {
            if(!adder.contains(nums[i])) {
                adder.add(nums[i]);
                backtrack(nums, res, adder);
                adder.remove(adder.size()-1);
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> adder = new ArrayList<>();

        if(nums.length == 1) {
            res.add(Arrays.asList(nums[0]));
            return res;
        }

        backtrack(nums, res, adder);
        return res;
    }
}