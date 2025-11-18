public class peakElementIn2d {
    public int[] findPeakGrid(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int left = 0;
        int right = cols - 1;

        while (left <= right) {
            int midCol = left + (right - left) / 2;

            // Find the maximum element in the midCol
            int maxRow = 0;
            for (int r = 0; r < rows; r++) {
                if (mat[r][midCol] > mat[maxRow][midCol]) {
                    maxRow = r;
                }
            }

            boolean isLeftBigger = (midCol - 1 >= 0) && (mat[maxRow][midCol - 1] > mat[maxRow][midCol]);
            boolean isRightBigger = (midCol + 1 < cols) && (mat[maxRow][midCol + 1] > mat[maxRow][midCol]);

            if (!isLeftBigger && !isRightBigger) {
                return new int[]{maxRow, midCol};
            } else if (isRightBigger) {
                left = midCol + 1;
            } else {
                right = midCol - 1;
            }
        }

        return new int[]{-1, -1}; // This line should never be reached
    }
}
