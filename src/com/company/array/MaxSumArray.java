package com.company.array;

public class MaxSumArray {
    public static int maxVowels(String s, int k) {
        int maxi=0;
        int count=0;
        int n=s.length();

        for(int i=0;i<n-k;i++){
            count=0;
            for(int j=0;j<k;j++){
                if(s.charAt(j)=='a' ||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'|| s.charAt(j)=='u' ){
                    count++;
                    maxi=Math.max(count,maxi);

                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        String s="leetcode";
        int k = 3;
        System.out.println(MaxSumArray.maxVowels(s,k));
    }
}
