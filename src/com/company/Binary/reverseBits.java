package com.company.Binary;

public class reverseBits {
    public  static int revBit(int n){
        int reverse=0;

        for(int i=0;i<32;i++){
            reverse=reverse<<1;
            reverse=reverse|(n&1);
            n=n>>1;
        }

        return reverse;
    }
    public static void main(String[] args) {
        int n = 0b00000010100101000001111010011100;
        System.out.println("reverse bit is "+reverseBits.revBit(n));


    }
}
