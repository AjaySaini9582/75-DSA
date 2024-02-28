package com.company.array;

import java.util.HashMap;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {

       //o(n)
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (!map.containsKey(diff)) {
                map.put(nums[i], i);
            } else {
                ans[0] = map.get(diff);
                ans[1] = i;
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int[] nums ={2,7,11,15};
        int target=9;
        int []an=TwoSumProblem.twoSum(nums,9);
        System.out.println(an[0]+" "+an[1]);
    }
}
