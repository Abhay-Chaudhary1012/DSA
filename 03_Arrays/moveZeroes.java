class Solution {
    public void moveZeroes(int[] nums) {
        int np = 0;  // Shorter variable name
        int n = nums.length;
        
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                // Only swap if necessary (when i != np)
                if(i != np){
                    nums[np] = nums[i];
                    nums[i] = 0;
                }
                np++;
            }
        }
    }
}