*/Given an n-digit large number in form of string, check whether it is divisible by 7 or not. Print 1 if divisible by 7, otherwise 0.*/


class Solution {
    int isdivisible7(String num) {
        
            long remainder = 0;
for (int i = 0; i < num.length(); i++) {
            // Update the remainder
            remainder = (remainder * 10 + (num.charAt(i) - '0')) % 7;
        }

        // Return 1 if divisible by 7, otherwise 0
        return (remainder == 0) ? 1 : 0;
    }
}