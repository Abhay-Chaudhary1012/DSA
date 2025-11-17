class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m * k > bloomDay.length){
            return -1;
        }
        
        int left = 1;
        int right = 0;

        for(int day : bloomDay){
            right = Math.max(right, day);
        }
        
        int answer = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(canMakeBouquet(bloomDay, m, k, mid)){
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return answer;
    }
    
    private boolean canMakeBouquet(int[] bloomDay, int m, int k, int days){
        int bouquets = 0;
        int consecutive = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= days){
                consecutive++;
                if(consecutive == k){
                    bouquets++;
                    consecutive = 0;
                }
            } else {
                consecutive = 0;
            }
            
            if(bouquets >= m){
                return true;
            }
        }
        
        return bouquets >= m;
    }
}