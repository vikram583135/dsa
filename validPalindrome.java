/*
Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
and removing all non-alphanumeric characters, it reads the same forward and backward.
Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Input Format
A single line containing the string s.

Output Format
Print true if s is a palindrome, otherwise false.

Example 1
Input
A man, a plan, a canal: Panama
Output
true
Explanation
"amanaplanacanalpanama" is a palindrome.

Example 2
Input
race a car
Output
false
Explanation
"raceacar" is not a palindrome.

Example 3
Input
 
Output
true
Explanation
s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.

Constraints
1 <= s.length <= 2 * 10^5
s consists only of printable ASCII characters.
*/

import java.io.*;
import java.util.*;

public class validPalindrome {
    static class Solution {
        public boolean isPalindrome(String s) {
            if (s == null) return false;

            int left = 0;
            int right = s.length() - 1;

            while (left < right) {
                // Advance left pointer past non-alphanumeric characters
                while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                    left++;
                }
                // Retreat right pointer past non-alphanumeric characters
                while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                    right--;
                }

                // Case-insensitive comparison
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }

                left++;
                right--;
            }

            return true;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) {
            s = "";
        }

        Solution obj = new Solution();
        System.out.println(obj.isPalindrome(s));
    }
}
