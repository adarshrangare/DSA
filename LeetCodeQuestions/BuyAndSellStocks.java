class BuyAndSellStocks {
    public int maxProfit(int[] prices) {

        
        int n = prices.length;

        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0;i<n;i++){

            maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            minPrice = Math.min(minPrice, prices[i]);

        }

    return maxProfit;       
    }
}
