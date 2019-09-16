package algorithm.leetcode.s1_two_sum;

import java.util.ArrayList;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> cache = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;
            if (cache.contains(diff)) {
                return new int[] { cache.indexOf(diff), i };
            }
            cache.add(num);
        }
        return nums;
    }

}
