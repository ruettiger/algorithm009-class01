package com.rudy.study;

import java.util.HashMap;

public class TwoSum {
    //1.暴力求解法
    //2.Hashmap求解
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};

    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.containsKey(complement) && i != hashMap.get(complement)) {
                return new int[]{i, hashMap.get(complement)};
            }
        }
        return new int[]{-1, -1};

    }

    public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (hashMap.containsKey(complement) && i != hashMap.get(complement)) {
                return new int[]{i, hashMap.get(complement)};
            }
            hashMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
