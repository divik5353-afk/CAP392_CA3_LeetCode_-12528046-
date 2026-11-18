// EASY QUESTION OF LEET CODE

// QUESTION 258 ADD DIGITS
class Solution {
    public int addDigits(int num) {

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        return num;
    }
}
//QUESTION 125 VALID PALINDROME
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String clean = "";
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                clean = clean + ch;
            }
        }
        
        String rev = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            rev = rev + clean.charAt(i);
        }
        
        return clean.equals(rev);
    }
}

//QUESTION 367 VALID PERFECT SQUARE

class Solution {
    public boolean isPerfectSquare(int num) {

        int i = 1;

        while (i <= num / i) {

            if (i * i == num) {
                return true;
            }

            i++;
        }

        return false;
    }
}

//QUESTION 412 FIZZ BUZZ

import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {

        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                ans.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                ans.add("Fizz");
            }
            else if (i % 5 == 0) {
                ans.add("Buzz");
            }
            else {
                ans.add(String.valueOf(i));
            }
        }

        return ans;
    }
}

//QUESTION 58 LENGTH OF LAST WORD
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) != ' ') {
                count++;
            } 
            else if (count > 0) {
                break;
            }
        }

        return count;
    }

    // QUESTION 509 FIBONACCI NUMBER
    class Solution {
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
} 

//QUESTION 1342 NUMBER OF STEPS  TO REDUCE A NUMBER TO ZERO
class Solution {
    public int numberOfSteps(int num) {

        int count = 0;

        while (num != 0) {

            if (num % 2 == 0) {
                num = num / 2;
            }
            else {
                num = num - 1;
            }

            count++;
        }

        return count;
    }
}

//QUESTION 231 POWER OF TWO
class Solution {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        return n == 1;
    }
}

// QUESTION 1295 FIND NUMBER WITH EVEN NUMBER OF DIGITS
class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int digits = 0;

            while (num > 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}


 

