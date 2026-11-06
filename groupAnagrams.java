/*
Group Anagrams

Given an array of strings strs, group the anagrams together.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Input Format
1st line contains an integer N denoting the number of strings.
2nd line contains N space-separated strings.

Output Format
Print each group of anagrams on a new line, with elements separated by a space.
Each group is sorted lexicographically, and the groups are printed in lexicographical order of their first word.

Example 1
Input
6
eat tea tan ate nat bat
Output
ate eat tea
bat
nat tan
Explanation
- "ate", "eat", and "tea" are anagrams.
- "bat" has no anagram partners.
- "nat" and "tan" are anagrams.

Example 2
Input
1
a
Output
a

Example 3
Input
1

Output

Constraints
1 <= N <= 10^4
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.
*/

import java.io.*;
import java.util.*;

public class groupAnagrams {
    static class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String sortedKey = new String(chars);

                map.computeIfAbsent(sortedKey, k -> new ArrayList<>()).add(s);
            }

            List<List<String>> result = new ArrayList<>(map.values());

            // Sort each group and sort groups for deterministic output
            for (List<String> group : result) {
                Collections.sort(group);
            }
            result.sort((a, b) -> a.get(0).compareTo(b.get(0)));

            return result;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        if (line1 == null || line1.trim().isEmpty()) {
            return;
        }

        int n = Integer.parseInt(line1.trim());
        String line2 = br.readLine();
        String[] strs;
        if (line2 == null || line2.trim().isEmpty()) {
            strs = new String[n];
            Arrays.fill(strs, "");
        } else {
            strs = line2.trim().split("\\s+");
        }

        Solution obj = new Solution();
        List<List<String>> grouped = obj.groupAnagrams(strs);

        StringBuilder sb = new StringBuilder();
        for (List<String> group : grouped) {
            for (int i = 0; i < group.size(); i++) {
                sb.append(group.get(i));
                if (i < group.size() - 1) {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}
