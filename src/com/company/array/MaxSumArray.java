package com.company.array;

public class MaxSumArray {
    public static int MaxSum(int []nums){
        int cur=nums[0];
        int maxi=nums[0];

        for(int i=1;i<nums.length;i++){
            cur=Math.max(nums[i],nums[i]+cur);
            maxi=Math.max(maxi,cur);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int []nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSumArray.MaxSum(nums));
    }
}
