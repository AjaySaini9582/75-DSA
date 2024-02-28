package com.company.array;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static boolean dp(int []nums){
        int n=nums.length;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else {
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {
//        int []nums={1,2,3,1};
        int []nums={1,2,3,4};
       boolean result= Duplicates.dp(nums);
        System.out.println("answere is "+result);
    }
}
