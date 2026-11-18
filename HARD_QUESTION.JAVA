// HARD QUESTION FOR LEET CODE 
// 65 valid number
class Solution {
    public boolean isNumber(String s) {

        boolean digit = false;
        boolean dot = false;
        boolean e = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digit = true;
            }

            else if (ch == '+' || ch == '-') {

                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

            else if (ch == '.') {

                if (dot || e) {
                    return false;
                }

                dot = true;
            }

            else if (ch == 'e' || ch == 'E') {

                if (e || !digit) {
                    return false;
                }

                e = true;
                digit = false;
            }

            else {
                return false;
            }
        }

        return digit;
    }
}

// 233 Number of digit one

class Solution {
    public int countDigitOne(int n) {

        long count = 0;

        for (long i = 1; i <= n; i = i * 10) {

            long divider = i * 10;

            long higher = n / divider;
            long current = (n / i) % 10;
            long lower = n % i;

            if (current == 0) {
                count = count + higher * i;
            }
            else if (current == 1) {
                count = count + higher * i + lower + 1;
            }
            else {
                count = count + (higher + 1) * i;
            }
        }

        return (int) count;
    }
}




