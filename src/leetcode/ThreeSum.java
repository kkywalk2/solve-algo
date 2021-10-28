package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {
            if (k > 0 && nums[k] == nums[k - 1])
                continue;

            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    list.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1])
                        i++;
                    while (i < j && nums[j] == nums[j + 1])
                        j--;
                } else if (sum > 0) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return list;
    }
}