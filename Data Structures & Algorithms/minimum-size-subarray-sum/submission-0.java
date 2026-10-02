class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int left = 0, total = 0;
        int res = Integer.MAX_VALUE;

        for(int r = 0; r < nums.length; r++){
            total += nums[r];
            while(total >= k){
                res = Math.min(r - left + 1,res);
                total -= nums[left];
                left++;
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res;
    }
}