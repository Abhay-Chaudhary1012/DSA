 int floor = findFloor(nums, x);
        int ceil = findCeil(nums, x);
        return new int[]{floor, ceil};
    }
    
    private int findFloor(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] <= x) {
                ans = nums[mid]; 
                left = mid + 1;   
            } else {
                right = mid - 1;  
            }
        }
        return ans;
    }
    
    private int findCeil(int[] nums, int x) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] >= x) {
                ans = nums[mid]; 
                right = mid - 1;  
            } else {
                left = mid + 1;   
            }
        }
        return ans;