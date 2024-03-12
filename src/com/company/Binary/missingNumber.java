package com.company.Binary;

public class missingNumber {
    public static int mis(int []nums){
        int xor=0;
        int n= nums.length;
        for(int i=0;i<=n;i++){
            xor=xor^i;
        }
        for(int i=0;i<n;i++){
            xor=xor^nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int []nums={9,6,4,2,3,5,7,0,1};
        System.out.println("missing number is "+missingNumber.mis(nums));
    }
}
