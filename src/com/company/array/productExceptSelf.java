package com.company.array;

public class productExceptSelf {
    public static int []product(int []nums){
        int [] prefixProduct=new int[nums.length];
        prefixProduct[0]=1;
        int sufixPorduct=1;

        for(int i=1;i<nums.length;i++){
            prefixProduct[i]=prefixProduct[i-1]*nums[i-1];
        }
        for(int i=nums.length-1;i>=0;i--){
            prefixProduct[i]=prefixProduct[i]*sufixPorduct;
            sufixPorduct=sufixPorduct*nums[i];
        }
        return prefixProduct;


    }
    public static void main(String[] args) {
    int []nums={1,2,3,4};
        int[] result = productExceptSelf.product(nums);

       
        System.out.print("Resulting Array: [");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if(i<result.length-1){
                System.out.print(",");
            }

            }
        System.out.print(" ]");

    }
}
