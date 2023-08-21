class BuyAndSellStocksII {
    public int maxProfit(int[] prices) {
        int profit =0;

        // We can check adjacent elements
        // If it next elemtn is greater than current so we can buy and sell
        for(int i=1;i<prices.length;i++){

            if(prices[i]>prices[i-1]){

                profit += prices[i] - prices[i-1];

            }

        }

        return profit;
    }
}
