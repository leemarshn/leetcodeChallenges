package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author - LeeN
 * PROJECT NAME: LeetcodeChallenges
 * CREATED ON: Sunday 23 January 2022 - 10:40 AM
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {7, 2, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSUm(nums, target)));
    }

    private int [] twoSUm(int[] nums, int target) {
        int [] indices = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int k = 0; k < i; k++) {
                if ((nums[k] + nums[i]) == target) {
                    indices = new int[]{k, i};
                   ;
                }
            }
        }
        return indices;

    }
}
