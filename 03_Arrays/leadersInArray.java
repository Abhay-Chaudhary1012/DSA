class Solution {
    public ArrayList<Integer> leaders(int[] nums) {  
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        
        if(n == 0) return leaders;
        
        int maxFromRight = nums[n-1];
        leaders.add(maxFromRight);
        
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] > maxFromRight) {
                maxFromRight = nums[i];
                leaders.add(maxFromRight);
            }
        }
        
        Collections.reverse(leaders);
        return leaders;
    }
}