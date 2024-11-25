package com.cracking_the_coding_interview;

public class StockProfit {
    public static void main(String[] args) {
        int arr[] = {100, 180, 260, 310, 40, 535, 695};

        int minPrice = arr[0];
        int maxProfit = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }else{
                int profit = arr[i]-minPrice;
                if(profit>maxProfit) maxProfit = profit;
            }
        }

        System.out.println("The Maximum Profit : "+maxProfit);
    }
}
