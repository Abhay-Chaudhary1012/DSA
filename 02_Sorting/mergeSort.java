class Solution {
    public int[] mergeSort(int[] nums) {
        // Base case: array of size 0 or 1 is already sorted
        if (nums.length <= 1) {
            return nums;
        }
        
        // Step 1: Split array into two halves
        int mid = nums.length / 2;
        
        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];
        
        // Copy elements to left and right arrays
        for (int i = 0; i < mid; i++) {
            left[i] = nums[i];
        }
        for (int i = mid; i < nums.length; i++) {
            right[i - mid] = nums[i];
        }
        
        // Step 2: Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);
        
        // Step 3: Merge the sorted halves
        return merge(left, right);
    }
    
    // Merge function (jo tumne likha tha)
    private int[] merge(int[] arr1, int[] arr2) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[arr1.length + arr2.length];
        
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }
        
        while(i < arr1.length){
            ans[k] = arr1[i];
            k++;
            i++;
        }
        
        while(j < arr2.length){
            ans[k] = arr2[j];
            k++;
            j++;
        }
        
        return ans;
    }
}