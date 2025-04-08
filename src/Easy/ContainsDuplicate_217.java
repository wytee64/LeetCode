package Easy;

import java.util.Arrays;

public class ContainsDuplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,5,4,7,8};
        System.out.println(new ContainsDuplicate_217().containsDuplicate(nums));
    }


}