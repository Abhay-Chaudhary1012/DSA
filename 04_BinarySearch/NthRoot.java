class Solution {
    public int NthRoot(int N, int M) {
        if (M == 0 || M == 1) return M;
        
        int left = 1;
        int right = M;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
       
            long power = 1;
            for (int i = 0; i < N; i++) {
                power *= mid;
                if (power > M) break;
            }
            
            if (power == M) {
                return mid; 
            } else if (power < M) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1; 
    }
}
    