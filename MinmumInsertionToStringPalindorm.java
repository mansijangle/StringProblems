*/Problem statement
A palindrome string is one that reads the same backward as well as forward.



You are given a string 'str'.



Find the minimum number of characters needed to insert in 'str' to make it a palindromic string.



Example :
Input: 'str' = "abca" */


public class Solution {
    
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create two arrays to store the LCS lengths
        int[] prev = new int[m + 1];
        int[] cur = new int[m + 1];

        // Base Case: Initialized to 0, as no characters matched yet.

        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    cur[ind2] = 1 + prev[ind2 - 1];
                else
                    cur[ind2] = Math.max(prev[ind2], cur[ind2 - 1]);
            }

            // Update prev array to store the current values using a clone of cur
            prev = cur.clone();
        }

        return prev[m];
    }


    static int longestPalindromeSubsequence(String s) {
        // Create a reversed version of the input string
        String reversed = new StringBuilder(s).reverse().toString();

        // Calculate the LCS of the original string and its reverse
        return lcs(s, reversed);
    }
    
    public static int minInsertion(String s) {
        // Write your code here.
        int n = s.length();
        int k = longestPalindromeSubsequence(s);

        // The minimum insertions required is the difference between the string length and its
        // Longest Palindromic Subsequence length
        return n - k;
    }
}