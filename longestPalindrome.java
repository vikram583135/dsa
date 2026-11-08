/*
Longest Palindromic Substring

Given a string s, return the longest palindromic substring in s.

Input Format
The first line contains a single string s.

Output Format
Print a single string denoting the longest palindromic substring in s.

Example 1
Input
babad
Output
bab
Explanation
"bab" is a palindromic substring of length 3. ("aba" is also valid).

Example 2
Input
cbbd
Output
bb
Explanation
"bb" is the longest palindromic substring of length 2.

Example 3
Input
a
Output
a

Constraints
1 <= s.length <= 1000
s consists of only digits and English letters.
*/

import java.io.*;
import java.util.*;

public class longestPalindrome {
    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() < 1) return "";

            int start = 0;
            int maxLen = 0;

            for (int i = 0; i < s.length(); i++) {
                // Odd-length palindromes (single-character center)
                int len1 = expandAroundCenter(s, i, i);
                // Even-length palindromes (two-character center)
                int len2 = expandAroundCenter(s, i, i + 1);

                int len = Math.max(len1, len2);
                if (len > maxLen) {
                    maxLen = len;
                    // Calculate start index of the palindrome
                    start = i - (len - 1) / 2;
                }
            }

            return s.substring(start, start + maxLen);
        }

        private int expandAroundCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            // Length of the valid palindrome before bounds became invalid
            return right - left - 1;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) {
            s = "";
        } else {
            s = s.trim();
        }

        Solution obj = new Solution();
        System.out.println(obj.longestPalindrome(s));
    }
}
