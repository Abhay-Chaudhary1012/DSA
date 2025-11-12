/*You are given a sorted array of integers arr and an integer target. Your task is to determine how many times target appears in arr.
Return the count of occurrences of target in the array */
class Solution {
    public int countOccurrences(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        
        if (first == -1) {
            return 0;
        }
        
        int last = findLastOccurrence(arr, target);
        return (last - first) + 1;
    }
    
    private int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int first = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                first = mid;        
                right = mid - 1;    
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }
    
    private int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int last = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                last = mid;        
                left = mid + 1;     
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }
}