class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i +1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    indexs[0] = i;
                    indexs[1] = j;
                    return indexs;
        
                }
            }
        }
        return new int[]{-1, -1};
    }
}