/*
Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring without duplicate characters.

Input Format
The first and only line of input contains a string s.

Output Format
Print a single integer denoting the length of the longest substring without repeating characters.

Example 1
Input
abcabcbb
Output
3
Explanation
The answer is "abc", with the length of 3.

Example 2
Input
bbbbb
Output
1
Explanation
The answer is "b", with the length of 1.

Example 3
Input
pwwkew
Output
3
Explanation
The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

Constraints
0 <= s.length <= 10^5
s consists of English letters, digits, symbols and spaces.
*/

import java.io.*;
import java.util.*;

public class longestSubstringWithoutRepeating {
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) return 0;

            Map<Character, Integer> lastSeen = new HashMap<>();
            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                // If the character was seen inside the current window, move the left pointer
                if (lastSeen.containsKey(c) && lastSeen.get(c) >= left) {
                    left = lastSeen.get(c) + 1;
                }

                lastSeen.put(c, right);
                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if (s == null) {
            s = "";
        }

        Solution obj = new Solution();
        System.out.println(obj.lengthOfLongestSubstring(s));
    }
}
