// public class Solution
public class GCD {
    /**
     * tinh ucln cua 2 so nguyen.
     */
    public int gcd(int a, int b) {
        //Solution s = new Solution();
        GCD s = new GCD();
        if (b == 0) {
            if (a > 0) {
                return a;
            }
            return -a;
        }
        return s.gcd(b, a % b);
    }
}   