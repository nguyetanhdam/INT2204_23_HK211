public class Solution {
    private int numerator; // tu so
    private int denominator = 1; // mau so

    // getter and setter

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * setter.
     */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    Solution(int numerator, int denominator) {
        if (denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * tim gcd.
     */
    public int ucln(int a, int b) {
        if (b == 0) {
            return a;
        }
        return ucln(b, a % b);
    }

    /**
     * rút gọn phân số.
     */
    public Solution reduce() {
        int x = ucln(numerator, denominator);
        return new Solution(numerator / x, denominator / x);
    }

    /**
     * cộng 2 phân số.
     */
    public Solution add(Solution fraction) {
        int n = numerator * fraction.denominator + fraction.numerator * denominator;
        int d = denominator * fraction.denominator;
        return new Solution(n / ucln(n, d), d / ucln(n, d));
    }

    /**
     * trừ 2 phân số.
     */
    public Solution subtract(Solution fraction) {
        int n = numerator * fraction.denominator - fraction.numerator * denominator;
        int d = denominator * fraction.denominator;
        return new Solution(n / ucln(n, d), d / ucln(n, d));
    }

    /**
     * nhân 2 phân số.
     */
    public Solution multiply(Solution fraction) {
        int n = numerator * fraction.numerator;
        int d = denominator * fraction.denominator;
        return new Solution(n / ucln(n, d), d / ucln(n, d));
    }

    /**
     * chia 2 phân số.
     */
    public Solution divide(Solution fraction) {
        int n = numerator * fraction.denominator;
        int d = denominator * fraction.numerator;
        if (d == 0) {
            return new Solution(numerator, denominator);
        }
        return new Solution(n / ucln(n, d), d / ucln(n, d));
    }

    /**
     * so sánh public boolean equals(Object obj).
     */
    public boolean equals(Object obj) {
        boolean res = false;
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            if (this.denominator * other.numerator == this.numerator * other.denominator) {
               return true;
            }
        }
        return false;
    }
}