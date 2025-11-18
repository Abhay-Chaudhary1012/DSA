public class matrixMedian {
    public int findMedian(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] < min) {
                min = matrix[i][0];
            }
            if (matrix[i][cols - 1] > max) {
                max = matrix[i][cols - 1];
            }
        }

        int desiredCount = (rows * cols + 1) / 2;

        while (min < max) {
            int mid = min + (max - min) / 2;
            int count = 0;

            for (int i = 0; i < rows; i++) {
                count += countLessEqual(matrix[i], mid);
            }

            if (count < desiredCount) {
                min = mid + 1;
            } else {
                max = mid;
            }
        }

        return min;
    }

    private int countLessEqual(int[] row, int target) {
        int left = 0;
        int right = row.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (row[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }
}
