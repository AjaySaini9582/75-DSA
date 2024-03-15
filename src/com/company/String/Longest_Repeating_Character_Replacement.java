package com.company.String;

public class Longest_Repeating_Character_Replacement {
    public static int fun(String s , int k){
        int left=0;
        int maxLength=0;
        int maxf=0;
        int []frequency=new int[26];
        for(int right=0;right<s.length();right++){
            maxf=Math.max(maxf,++frequency[s.charAt(right)-'A']);

            if(right-left+1 -maxf >k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            maxLength=Math.max(maxLength,right-left+1);
        }


        return maxLength;
    }
    public static void main(String[] args) {
            String s="ABAB";
            int k=2;

        int result=Longest_Substring_Without_Repeating_Characters.fun(s,k);
        System.out.println(result);
    }
}
