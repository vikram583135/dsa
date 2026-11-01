/*
Gas Station

There are N gas stations along a circular route, where the amount of gas at the ith station is gas[i].
You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station
to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.

Given two integer arrays gas and cost, return the starting gas station's index if you can travel
around the circuit once in the clockwise direction, otherwise return -1.
If there exists a solution, it is guaranteed to be unique.

Input Format
1st line contains an integer N denoting the number of gas stations.
2nd line contains N space-separated integers denoting elements of the gas array.
3rd line contains N space-separated integers denoting elements of the cost array.

Output Format
Print a single integer denoting the starting gas station's 0-based index or -1 if impossible.

Example 1
Input
5
1 2 3 4 5
3 4 5 1 2
Output
3
Explanation
Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4.
Travel to station 4. Your tank = 4 - 1 + 5 = 8.
Travel to station 0. Your tank = 8 - 2 + 1 = 7.
Travel to station 1. Your tank = 7 - 3 + 2 = 6.
Travel to station 2. Your tank = 6 - 4 + 3 = 5.
Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
Therefore, return 3 as the starting index.

Example 2
Input
3
2 3 4
3 4 3
Output
-1
Explanation
Total gas = 2 + 3 + 4 = 9. Total cost = 3 + 4 + 3 = 10.
Since total gas < total cost, it is impossible to complete the circuit.

Constraints
1 <= N <= 10^5
0 <= gas[i], cost[i] <= 10^4
*/

import java.io.*;
import java.util.*;

public class gasStation {
    static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost, int n) {
            long totalGas = 0;
            long totalCost = 0;
            long currentGas = 0;
            int startIndex = 0;

            for (int i = 0; i < n; i++) {
                totalGas += gas[i];
                totalCost += cost[i];
                currentGas += (gas[i] - cost[i]);

                // If running tank drops below 0, no station from startIndex up to i can be the start
                if (currentGas < 0) {
                    startIndex = i + 1;
                    currentGas = 0;
                }
            }

            // If overall gas is less than overall cost, circuit completion is impossible
            return (totalGas >= totalCost) ? startIndex : -1;
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] gas = new int[n];
            for (int i = 0; i < n; i++) {
                gas[i] = sc.nextInt();
            }

            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = sc.nextInt();
            }

            Solution obj = new Solution();
            System.out.println(obj.canCompleteCircuit(gas, cost, n));
        }
        sc.close();
    }
}
