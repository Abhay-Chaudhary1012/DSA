class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int maxSize = nums1.length + nums2.length;
        int[] resultArray = new int[maxSize];
        int index = 0;

        for(int i = 0; i < nums1.length; i++){
            boolean exists = false;
            
            for(int j = 0; j < index; j++){
                if(resultArray[j] == nums1[i]){
                    exists = true;
                    break;
                }
            }
            
            if(!exists){
                resultArray[index] = nums1[i];
                index++;
            }
        }

        for(int i = 0; i < nums2.length; i++){
            boolean exists = false;
            
            for(int j = 0; j < index; j++){
                if(resultArray[j] == nums2[i]){
                    exists = true;
                    break;
                }
            }
            
            if(!exists){
                resultArray[index] = nums2[i];
                index++;
            }
        }

        int[] finalResult = new int[index];
        for(int i = 0; i < index; i++){
            finalResult[i] = resultArray[i];
        }
        
        return finalResult;
    }
}