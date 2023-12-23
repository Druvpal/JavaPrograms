public class sellAndBuy {
    public static int profit(int[] prices){
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int i =0;i<prices.length;i++){
            buy = Math.min(prices[i], buy);
            sell = Math.max(sell, prices[i]-buy);
        }
        return sell;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,2,0,1};

        System.out.println(profit(arr));

    }
}
