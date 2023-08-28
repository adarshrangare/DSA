class Solution {
    public int candy(int[] ratings) {
        int [] candies = new int[ratings.length];
        int n = candies.length;
        Arrays.fill(candies,1);

        if(ratings.length==1) return 1;

        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1] && candies[i]<=candies[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i=n-2;i>=0;i--){
            if(ratings[i]>ratings[i+1] && candies[i]<=candies[i+1]){
                candies[i] = candies[i+1]+1;
            }

        }
        
        int sum =0;
        for(int i:candies){
            sum+=i;
        }

        return sum;
    }
}
