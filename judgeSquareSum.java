class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0, r = (int) Math.sqrt(c);;
        while (l <= r) {
            long ans = l * l + r * r;
            if (ans > c) {
                r--;
            } else if (ans < c) {
                l++;
            } else {
                return true;
            }
        }
        return false;
    }
}
