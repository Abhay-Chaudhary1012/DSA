class Solution {
    public int rowWithMax1s(int[][] mat) {
      int m = mat.length;
      int n = mat[0].length;

      int maxRow = -1;
      int maxCount = 0;

      for(int i =0; i < m; i++){
        int firstOneIndex = findFirstOne(mat[i]);

        if(firstOneIndex != -1){
          int countOnes = n - firstOneIndex;

          if(countOnes > maxCount){
            maxCount = countOnes;
            maxRow = i;
          }
        }
      }
      return maxRow;
    }
    private int findFirstOne(int[]row){
      int left = 0;
      int right = row.length -1;
      int result = -1;

      while(left <= right){
        int mid = left + (right - left)/2;
         if(row[mid]== 1){
          result = mid;
          right = mid -1;
         }else{
          left = mid +1;
         }
      }
     return result;
    }   
}