class Solution {
    public int reverse(int x) {
        int revx = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Check overflow before multiplication
            if (revx > Integer.MAX_VALUE / 10 ||
                (revx == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (revx < Integer.MIN_VALUE / 10 ||
                (revx == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            revx = revx * 10 + digit;
        }

        return revx;
    }
}