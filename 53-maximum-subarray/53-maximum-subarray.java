class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int ans =nums[0];
        int sum =0;
        
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            ans = Math.max(ans,sum);
            if(sum<0){
                sum =0;
            }

        }
        return ans;
    }
}