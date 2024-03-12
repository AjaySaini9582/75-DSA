package com.company.Binary;

public class countingBits {
    public static void count(int n){
        int[] ans=new int[n+1];
        ans[0]=0;
        for(int i=1;i<=n;i++) {
            ans[i] = ans[i & (i - 1)] + 1;
        }
        for(int i=0;i<=n;i++){
            System.out.println(ans[i]+" ");
        }

    }
    public static void main(String[] args) {
        int n=5;
       countingBits.count(n);
    }
}
