
class Solution {
    public int linearSearch(int nums[], int target) {
		//Your code goes here
       for (int i = 0; i < nums.length; i++) {
            // Check if current element equals target
            if (nums[i] == target) {
                return i; // Return index if found
            }
        }
        return -1; // Return -1 if not found
    }
    }
