package algorithm.leetcode.s1_two_sum;


import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int tmp = target - nums[i];
            if(map.containsKey(tmp)){
                return new int[]{map.get(tmp),i};   //存在即返回
            }
            map.put(nums[i],i);  //不存在，则加入
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
