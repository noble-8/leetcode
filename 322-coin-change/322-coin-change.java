class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[0]=0;
        int min;
        for(int i=0;i<amount+1;i++){
            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    min = arr[i-coins[j]];
                    if(min+1<arr[i]&& min!=Integer.MAX_VALUE){
                        arr[i]=min+1;
                    }
                }
            }
        }
        
        return arr[amount]==Integer.MAX_VALUE?-1:arr[amount];
    }
}