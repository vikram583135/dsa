/*
Permutation in String

Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
In other words, return true if one of s1's permutations is the substring of s2.

Input Format
1st line contains a string s1 consisting of lowercase English letters.
2nd line contains a string s2 consisting of lowercase English letters.

Output Format
Print true if s2 contains a permutation of s1, otherwise false.

Example 1
Input
ab
eidbaooo
Output
true
Explanation
s2 contains one permutation of s1 ("ba").

Example 2
Input
ab
eidboaoo
Output
false

Constraints
1 <= s1.length, s2.length <= 10^5
s1 and s2 consist of lowercase English letters.
*/

import java.io.*;
import java.util.*;

public class checkInclusion {
    static class Solution {
        public boolean checkInclusion(String s1, String s2) {
            int n1 = s1.length();
            int n2 = s2.length();
            if (n1 > n2) return false;

            int[] s1Count = new int[26];
            int[] s2Count = new int[26];

            for (int i = 0; i < n1; i++) {
                s1Count[s1.charAt(i) - 'a']++;
                s2Count[s2.charAt(i) - 'a']++;
            }

            int matches = 0;
            for (int i = 0; i < 26; i++) {
                if (s1Count[i] == s2Count[i]) {
                    matches++;
                }
            }

            if (matches == 26) return true;

            for (int i = n1; i < n2; i++) {
                int r = s2.charAt(i) - 'a';
                int l = s2.charAt(i - n1) - 'a';

                // Add character entering window
                s2Count[r]++;
                if (s2Count[r] == s1Count[r]) {
                    matches++;
                } else if (s2Count[r] == s1Count[r] + 1) {
                    matches--;
                }

                // Remove character leaving window
                s2Count[l]--;
                if (s2Count[l] == s1Count[l]) {
                    matches++;
                } else if (s2Count[l] == s1Count[l] - 1) {
                    matches--;
                }

                if (matches == 26) return true;
            }

            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s1 = sc.next();
            if (sc.hasNext()) {
                String s2 = sc.next();
                Solution obj = new Solution();
                System.out.println(obj.checkInclusion(s1, s2));
            }
        }
        sc.close();
    }
}
