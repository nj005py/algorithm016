package info.nj005py.exercise;

import java.util.Arrays;

public class Rotate {
    public static void rotate(int[] nums, int k) {
        int[] tmp = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            tmp[j] = nums[(j + k) % nums.length];
        }
        for (int i = 0; i < nums.length; i++){
            nums[i] = tmp[i];
        }
//        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums,3);
    }
}
