import java.util.*;

class Solution {
    public int[] divisors(int n) {
        // ArrayList use karenge kyunki pata nahi kitne divisors honge
        List<Integer> divisorsList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisorsList.add(i);  // Add divisor to list
            }
        }
        
        // Convert ArrayList to array
        int[] result = new int[divisorsList.size()];
        for (int i = 0; i < divisorsList.size(); i++) {
            result[i] = divisorsList.get(i);
        }
        
        return result;
    }
}
