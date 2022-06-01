public class Buyandsellstock {
    public static void main(String[] args){
        int[] test = {5,10,0,1};
        System.out.println(maxProfit(test));
    }

    public static int maxProfit(int[] prices){
        // [1,2,3,4,5] = 4
        // [5,4,3,2,1] = 0
        // [5,10,0,1] = 5
        int maxProfit = 0;
        for(int i = 0; i < prices.length; i ++){
            for(int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
