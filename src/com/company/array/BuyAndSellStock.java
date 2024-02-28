package com.company.array;

public class BuyAndSellStock {
    public static int BuySell(int []prices){
        int n=prices.length;
        int profit=0;
        int left=0;
        for(int right=1;right<n;right++){
            if(prices[right]>prices[left]){
                profit= Math.max(profit,  prices[right]-prices[left]);
            }
            else{
                left=right;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int []price={7,1,5,3,6,4};
        int result=BuyAndSellStock.BuySell(price);
        System.out.println("this stoke has max profit "+result);
    }
}
