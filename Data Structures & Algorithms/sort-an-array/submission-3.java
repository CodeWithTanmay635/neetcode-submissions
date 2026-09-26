
//Counting sort algorithim
class Solution {
    public int[] sortArray(int[] nums) {
        int max = 0;
        int min = 0;
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
        }

        //create a frequency array based on the range of numbers
        int[] count = new int[max - min + 1];
        for(int num : nums){
            count[num - min]++;
        }

        //overwrite the array using the frequencies 
        int index = 0;
        for(int i = 0; i < count.length; i++){
                while(count[i] > 0){
                    nums[index++] = i + min;
                    count[i]--;
                }
        }
        return nums;
    }
}