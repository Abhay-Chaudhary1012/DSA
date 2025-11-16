public class kokoEatingBanana {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = getMax(piles);
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean canEatAll(int[] piles, int h, int speed) {
        int hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += Math.ceil((double) pile / speed);
        }
        return hoursNeeded <= h;
    }

    private int getMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }
        return max;
    }
}
