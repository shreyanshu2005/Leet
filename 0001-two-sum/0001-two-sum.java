class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele:nums){
            set.add(ele);
        }
        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (set.contains(rem)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == rem) {
                        return new int[]{i, j};
                    }
                }
            }
        }

        return new int[]{};      
    }
}
