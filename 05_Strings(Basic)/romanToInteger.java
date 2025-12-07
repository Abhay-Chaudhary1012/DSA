class Solution {

    private int getVal(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
    }

    public int romanToInt(String s) {
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int curr = getVal(s.charAt(i));

            // next value (if exists)
            if (i + 1 < n) {
                int next = getVal(s.charAt(i + 1));
                if (curr < next) {
                    // subtractive case, e.g. IV, IX, XL, etc.
                    result -= curr;
                } else {
                    result += curr;
                }
            } else {
                result += curr;
            }
        }

        return result;
    }
}
