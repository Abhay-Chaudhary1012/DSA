class Solution {
    public int secondLargestElement(int[] nums) {

        if(nums.length < 2){
            return -1;
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i < nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i< nums.length;i++){
            if(nums[i]>secondMax && nums[i] != max){
                secondMax = nums[i];
            }
        }
            return (secondMax == Integer.MIN_VALUE)? -1 : secondMax;
    }
}