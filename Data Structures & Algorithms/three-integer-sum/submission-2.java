class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        if(n < 3) return list;
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i - 1] ) continue;
            if(nums[i] > 0) break;
            if(nums[i] + nums[i + 1] + nums[i + 2] > 0) break;
            if(nums[i] + nums[n - 2] + nums[n - 1] < 0) continue;
            int left = i + 1;
            int right = n - 1;
            while(left < right){
                sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    list.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            
                else if(sum < 0) {
                    left++;
                }else{
                    right--;
                }
            }
        }
        return list;
    }
}