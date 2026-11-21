/*
Minimum Window Substring

Given two strings s and t of lengths m and n respectively, return the minimum window substring
of s such that every character in t (including duplicates) is included in the window.
If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

Input Format
1st line contains string s.
2nd line contains string t.

Output Format
Print the minimum window substring, or an empty line if no such substring exists.

Example 1
Input
ADOBECODEBANC
ABC
Output
BANC
Explanation
The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

Example 2
Input
a
a
Output
a
Explanation
The entire string s is the minimum window.

Example 3
Input
a
aa
Output

Explanation
Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.

Constraints
1 <= s.length, t.length <= 10^5
s and t consist of uppercase and lowercase English letters.
*/

import java.io.*;
import java.util.*;

public class minWindow {
    static class Solution {
        public String minWindow(String s, String t) {
            if (s == null || t == null || s.length() < t.length()) {
                return "";
            }

            // Frequency map for target characters in t
            int[] tFreq = new int[128];
            int required = 0;
            for (char c : t.toCharArray()) {
                if (tFreq[c] == 0) {
                    required++; // Count unique characters in t
                }
                tFreq[c]++;
            }

            // Frequency map for current sliding window in s
            int[] windowFreq = new int[128];
            int formed = 0; // Number of unique characters currently satisfying t's frequency

            int left = 0;
            int minLen = Integer.MAX_VALUE;
            int minStart = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);
                windowFreq[c]++;

                // If current character matches the target frequency, increment formed
                if (tFreq[c] > 0 && windowFreq[c] == tFreq[c]) {
                    formed++;
                }

                // Contract window from the left once all required character frequencies are met
                while (left <= right && formed == required) {
                    if (right - left + 1 < minLen) {
                        minLen = right - left + 1;
                        minStart = left;
                    }

                    char leftChar = s.charAt(left);
                    windowFreq[leftChar]--;
                    if (tFreq[leftChar] > 0 && windowFreq[leftChar] < tFreq[leftChar]) {
                        formed--;
                    }
                    left++;
                }
            }

            return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            if (sc.hasNext()) {
                String t = sc.next();
                Solution obj = new Solution();
                System.out.println(obj.minWindow(s, t));
            }
        }
        sc.close();
    }
}
