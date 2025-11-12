/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity. */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = findfirstOccurance(nums, target);
        int last = findlastOccurance(nums, target);
        return new int[]{first,last};
    }
    private int findfirstOccurance(int nums[],int target){
        int left = 0;int right = nums.length -1;
        int first = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                first = mid;
                right = mid -1;
            }else if(nums[mid]< target){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return first;
    }
    private int findlastOccurance(int nums[],int target){
        int left = 0;int right = nums.length -1;
        int last = -1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] == target){
                last = mid;
                left = mid +1;
            }else if(nums[mid]< target){
                left = mid +1;
            }else{
                right = mid - 1;
            }
        }
        return last;
    }
}