/*
Longest Repeating Character Replacement

You are given a string s consisting of uppercase English letters and an integer k.
You can choose any character of the string and change it to any other uppercase English character.
You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.

Input Format
1st line contains a string s consisting of uppercase English letters.
2nd line contains an integer k.

Output Format
Print a single integer denoting the maximum length of a substring with identical letters after at most k replacements.

Example 1
Input
ABAB
2
Output
4
Explanation
Replace the two 'A's with two 'B's or vice versa.

Example 2
Input
AABABBA
1
Output
4
Explanation
Replace the one 'A' in the middle with 'B' and form "AABBBBA". The substring "BBBB" has length 4.

Constraints
1 <= s.length <= 10^5
s consists of only uppercase English letters.
0 <= k <= s.length
*/

import java.io.*;
import java.util.*;

public class characterReplacement {
    static class Solution {
        public int characterReplacement(String s, int k) {
            if (s == null || s.length() == 0) return 0;

            int[] count = new int[26];
            int left = 0;
            int maxFreq = 0;
            int maxLen = 0;

            for (int right = 0; right < s.length(); right++) {
                char curr = s.charAt(right);
                count[curr - 'A']++;
                maxFreq = Math.max(maxFreq, count[curr - 'A']);

                // Number of characters to replace = (window length - most frequent character count)
                // If it exceeds k, shrink the window from the left
                while ((right - left + 1) - maxFreq > k) {
                    count[s.charAt(left) - 'A']--;
                    left++;
                }

                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            if (sc.hasNextInt()) {
                int k = sc.nextInt();
                Solution obj = new Solution();
                System.out.println(obj.characterReplacement(s, k));
            }
        }
        sc.close();
    }
}
