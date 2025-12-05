class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int[] freq = new int[26];  // for lowercase letters

        for(char c : s.toCharArray())
            freq[c - 'a']++;

        for(char c : t.toCharArray())
            freq[c - 'a']--;

        for(int num : freq)
            if(num != 0) return false;

        return true;
    }
}
// import java.util.Arrays;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) return false;

//         char[] a = s.toCharArray();
//         char[] b = t.toCharArray();

//         Arrays.sort(a);
//         Arrays.sort(b);

//         return Arrays.equals(a, b);
//     }
// }
