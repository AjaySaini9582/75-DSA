package com.company.Binary;

public class NumberoneBit {
    public static int OneBit(int n){
        int count = 0;


        while (n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        int n=00000000000000000000000000001011;
      int resilt=NumberoneBit.OneBit(n);
        System.out.println("Number of '1' bits: " + resilt);
    }
}
