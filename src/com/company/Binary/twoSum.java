package com.company.Binary;

public class twoSum {
    public static int TwoSumOfBit(int a,int b){
       while (b!=0){
           int temp=a ^ b;
           int carry= (a & b)<<1;
           a=temp;
           b=carry;
       }

        return a;
    }
    public static void main(String[] args) {
      int a=1;
      int b=2;
        System.out.println(twoSum.TwoSumOfBit(a,b));
    }
}
