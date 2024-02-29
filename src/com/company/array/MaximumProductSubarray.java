package com.company.array;

public class MaximumProductSubarray {
    public static int MaxSum1(int []nums){
        int ans=Integer.MIN_VALUE;
        int prefix=1;
        int sufix=1;

        int n= nums.length;
        for(int i=0;i<nums.length;i++){
            if(prefix==0)prefix=1;
            if(sufix==0)sufix=1;

            prefix=prefix*nums[i];
            sufix=sufix*nums[n-1-i];
            ans=Math.max(ans,Math.max(prefix,sufix));

        }

        return ans;
    }

    public static void main(String[] args) {
        int []nums={2,3,-2,4};
       int result=MaximumProductSubarray.MaxSum1(nums);
        System.out.println(result);
    }
}
