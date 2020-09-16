package info.nj005py.exercise.week2;

import info.nj005py.exercise.Util;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public int[] twoSum2(int[] nums,int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (map.containsKey(x)) {
                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("no two sum");
    }

    public static void main(String[] args) {
        TwoSum x = new TwoSum();
        Util.printArray(x.twoSum2(new int[]{2,7,11,15},9));

    }
}
