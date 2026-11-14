# 🧠 Data Structures & Algorithms (DSA) Interactive Master Guide

<div align="center">

![Java](https://img.shields.io/badge/Language-Java_17+-orange?style=for-the-badge&logo=java)
![Total Problems](https://img.shields.io/badge/Problems_Solved-54+-blue?style=for-the-badge)
![Easy](https://img.shields.io/badge/Easy-22-brightgreen?style=for-the-badge)
![Medium](https://img.shields.io/badge/Medium-31-yellow?style=for-the-badge)
![Hard](https://img.shields.io/badge/Hard-1-red?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-purple?style=for-the-badge)

**A structured, pattern-based repository of DSA implementations in Java with time/space complexities, intuitive walkthroughs, and an interactive study tracker.**

[📌 Learning Roadmap](#-interactive-learning-roadmap) • [🎯 Pattern Matrix](#-pattern-decision-matrix) • [🚀 Problem Catalog](#-interactive-problem-catalog) • [💻 How to Run](#-how-to-compile--run)

</div>

---

## 📊 Preparation Progress Tracker

Use the interactive checkboxes below to track your preparation journey. *(You can tick/untick these directly on GitHub!)*

```text
Progress: [████████████████████████████████████████] 54 / 54 Problems Ready
```

- [ ] **Phase 1: Basic Mastery** (Math, Patterns, Basic Arrays) — `15/15`
- [ ] **Phase 2: Core Two-Pointers & Binary Search** — `14/14`
- [ ] **Phase 3: Prefix Sums, HashMaps & Sliding Window** — `8/8`
- [ ] **Phase 4: 2D Matrix & Intervals** — `6/6`
- [ ] **Phase 5: Greedy, Permutations & Hard Challenges** — `11/11`

---

## 📌 Interactive Learning Roadmap

Follow this dependency path to build intuition from ground up:

```mermaid
flowchart TD
    subgraph S1["Phase 1: Foundations"]
        A["Math & Number Theory<br/>(Primes, Armstrong, nCr)"]
        B["Pattern Printing & Logic<br/>(Diamonds, Cyclic Chars, Fibonacci)"]
        C["Array Basics & Scans<br/>(Max, 2nd Max, Array Math)"]
    end

    subgraph S2["Phase 2: Two Pointers & Searching"]
        D["Two / Three Pointers<br/>(Dutch Flag, 3Sum, 4Sum, Container)"]
        E["Binary Search<br/>(Rotated Array, 2D Matrix, Peak)"]
    end

    subgraph S3["Phase 3: Subarrays & Windows"]
        F["Prefix Sums & Hashing<br/>(Subarray Sum = K, Longest Consec)"]
        G["Sliding Window<br/>(Longest Non-Repeating Substring)"]
    end

    subgraph S4["Phase 4: Advanced Arrays & Grids"]
        H["Matrix Transformations<br/>(Rotate 90°, Spiral Order)"]
        I["Intervals & Merging<br/>(Merge Intervals)"]
    end

    subgraph S5["Phase 5: Hard & Greedy"]
        J["Trapping Rain Water & Kadane's<br/>(Peak In-place Optimizations)"]
    end

    A --> C
    B --> C
    C --> D
    C --> E
    D --> F
    E --> G
    F --> H
    G --> I
    H --> J
    I --> J
```

---

## 🎯 Pattern Decision Matrix

Quick lookup guide for competitive programming and technical interviews:

| If the problem involves... | Consider this Pattern | Target Complexity | Example Problem |
| :--- | :--- | :---: | :--- |
| Sorted array with pairs/triplets | **Two Pointers** | $\mathcal{O}(N)$ or $\mathcal{O}(N^2)$ | [`threeSum.java`](./threeSum.java) |
| Longest palindromic substring | **Expand Around Center Pointers** | $\mathcal{O}(N^2)$ | [`longestPalindrome.java`](./longestPalindrome.java) |
| Sorted or monotonic sequence looking for target/peak | **Binary Search** | $\mathcal{O}(\log N)$ | [`searchRotatedSortedArray.java`](./searchRotatedSortedArray.java) |
| Minimum element in rotated sorted array | **Pivot Boundary Binary Search** | $\mathcal{O}(\log N)$ | [`findMinRotated.java`](./findMinRotated.java) |
| First & last occurrence in sorted array | **Dual Boundary Binary Search** | $\mathcal{O}(\log N)$ | [`searchRange.java`](./searchRange.java) |
| Contiguous substring or subarray with constraints | **Sliding Window** | $\mathcal{O}(N)$ | [`longestSubstringWithoutRepeating.java`](./longestSubstringWithoutRepeating.java) |
| Minimal length subarray with sum $\ge$ target | **Dynamic Sliding Window** | $\mathcal{O}(N)$ | [`minSubArrayLen.java`](./minSubArrayLen.java) |
| Longest substring with $\le K$ character replacements | **Frequency Counter Sliding Window** | $\mathcal{O}(N)$ | [`characterReplacement.java`](./characterReplacement.java) |
| Continuous subarray sums or frequency matching | **Prefix Sum + HashMap** | $\mathcal{O}(N)$ | [`subArraySumK.java`](./subArraySumK.java) |
| Grouping anagrams / character frequencies | **Sorted String / Frequency Key** | $\mathcal{O}(N \cdot K \log K)$ | [`groupAnagrams.java`](./groupAnagrams.java) |
| Unsorted elements where order is not required | **HashSet Lookup** | $\mathcal{O}(N)$ | [`longestConsecutive.java`](./longestConsecutive.java) |
| Grid manipulation without auxiliary storage | **In-Place Transposition** | $\mathcal{O}(N^2)$ | [`rotateMatrix.java`](./rotateMatrix.java) |
| Zeroing rows/columns in-place | **First Row & Col As Markers** | $\mathcal{O}(M \times N)$ | [`setMatrixZeroes.java`](./setMatrixZeroes.java) |
| Overlapping time ranges, meetings, or segments | **Sorting by Start Time** | $\mathcal{O}(N \log N)$ | [`mergeIntervals.java`](./mergeIntervals.java) |
| Insert interval into sorted non-overlapping list | **Linear Merge & Scan** | $\mathcal{O}(N)$ | [`insertInterval.java`](./insertInterval.java) |
| Minimizing interval overlaps / scheduling | **Greedy Sort by End Time** | $\mathcal{O}(N \log N)$ | [`eraseOverlapIntervals.java`](./eraseOverlapIntervals.java) |
| Best time to buy & sell stock (single pass) | **Greedy Running Minimum** | $\mathcal{O}(N)$ | [`maxProfit.java`](./maxProfit.java) |
| Largest/smallest subarray sum on linear sequence | **Kadane's Greedy Scan** | $\mathcal{O}(N)$ | [`maxSubArray.java`](./maxSubArray.java) |
| Non-adjacent element maximization | **1D State Transition DP** | $\mathcal{O}(N)$ | [`houseRobber.java`](./houseRobber.java) |
| Fewest coins / unbounded knapsack | **Bottom-Up 1D DP** | $\mathcal{O}(N \cdot \text{amount})$ | [`coinChange.java`](./coinChange.java) |
| Array jumping / reachability | **Greedy Max Reach** | $\mathcal{O}(N)$ | [`jumpGame.java`](./jumpGame.java) |
| Circular route with fuel & cost | **Greedy Deficit Reset** | $\mathcal{O}(N)$ | [`gasStation.java`](./gasStation.java) |
| Elevation bars trapping liquid | **Dual Boundary Pointers** | $\mathcal{O}(N)$ | [`trappingRainWater.java`](./trappingRainWater.java) |

---

## 🚀 Interactive Problem Catalog

<details open>
<summary><h3>1. 🎯 Two Pointers & Multi-Pointers (9 Problems)</h3></summary>

> **Pattern Essence:** Advance two or more indices towards each other or in lockstep to avoid quadratic brute-force loops.

- [ ] **[Longest Palindromic Substring](./longestPalindrome.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N^2)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Treat each position and pair as a potential center (odd and even lengths). Use two pointers expanding outward (<code>left--</code>, <code>right++</code>) as long as characters match, tracking the maximum palindrome length found.
    </details>

- [ ] **[Sort Array of 0s, 1s, and 2s](./sort012.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Use the <i>Dutch National Flag algorithm</i> with three pointers: <code>low</code>, <code>mid</code>, and <code>high</code>. Elements before <code>low</code> are 0, after <code>high</code> are 2, and between <code>low</code> and <code>mid</code> are 1.
    </details>

- [ ] **[Container With Most Water](./containerWithMostWater.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Place pointers at opposite ends. The area is bounded by the shorter line; to find a larger area, shift the pointer corresponding to the shorter height inward.
    </details>

- [ ] **[3Sum (Triplets with Sum = 0)](./threeSum.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N^2)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort array first. Fix <code>nums[i]</code> and run two-pointer scan for the remaining two numbers. Skip adjacent equal numbers to prevent duplicate triplets.
    </details>

- [ ] **[4Sum (Quadruplets with Sum = Target)](./fourSum.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N^3)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort array and use two nested loops for the first two values, followed by two pointers for the remaining pair. Use 64-bit <code>long</code> to avoid integer overflow.
    </details>

- [ ] **[Trapping Rain Water](./trappingRainWater.java)** `🔴 Hard`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain <code>leftMax</code> and <code>rightMax</code>. Process whichever boundary is smaller, adding <code>(boundaryMax - currentHeight)</code> to total trapped water.
    </details>

- [ ] **[Pairs with Difference K](./diffPairs.java)** `🟢 Easy`
  - **Complexity:** $\mathcal{O}(N \log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort or utilize a hash table to find pairs $(i, j)$ satisfying $|arr[i] - arr[j]| = K$.
    </details>

- [ ] **[Divisible Sum Pairs](./diviSUmPairMain.java)** `🟢 Easy`
  - **Complexity:** $\mathcal{O}(N^2)$ / $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Count pairs where $(arr[i] + arr[j]) \pmod K == 0$.
    </details>

- [ ] **[Geometric Progression Triplets](./triplet.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N^3)$ / $\mathcal{O}(N^2)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Check for GP validity $b^2 = a \cdot c$ using 64-bit integers to prevent numerical overflow.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>2. 🔍 Binary Search (5 Problems)</h3></summary>

> **Pattern Essence:** Halve the search domain each iteration on sorted arrays, partitioned spaces, or monotonic answer ranges.

- [ ] **[Find Minimum in Rotated Sorted Array](./findMinRotated.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(\log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Compare <code>nums[mid]</code> with <code>nums[high]</code>. If <code>nums[mid] > nums[high]</code>, the minimum lies strictly in the right half (<code>low = mid + 1</code>). Otherwise, the right half is sorted and the inflection/minimum is at <code>mid</code> or to its left (<code>high = mid</code>).
    </details>

- [ ] **[First and Last Position of Element in Sorted Array](./searchRange.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(\log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Run two separate binary searches: one that continues searching to the left (<code>high = mid - 1</code>) upon finding <code>target</code> to locate the first occurrence, and another that continues searching to the right (<code>low = mid + 1</code>) to find the last occurrence.
    </details>

- [ ] **[Search in Rotated Sorted Array](./searchRotatedSortedArray.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(\log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    At any <code>mid</code>, one half is always strictly sorted. Determine which half is sorted, then check if <code>target</code> falls in that interval to discard the other half.
    </details>

- [ ] **[Search a 2D Matrix](./search2DMatrix.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(\log(M \times N))$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Treat the matrix as a virtual 1D sorted array of length $M \times N$. Map <code>mid</code> to 2D indices via <code>row = mid / N</code> and <code>col = mid % N</code>.
    </details>

- [ ] **[Find Peak Element](./findPeakElement.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(\log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Compare <code>nums[mid]</code> with <code>nums[mid + 1]</code>. If <code>nums[mid] > nums[mid+1]</code>, a peak must exist on the left slope; otherwise it exists on the right slope.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>3. 🪟 Sliding Window (3 Problems)</h3></summary>

> **Pattern Essence:** Expand and contract dynamic windows to track contiguous substring/subarray properties in single passes.

- [ ] **[Longest Repeating Character Replacement](./characterReplacement.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain a 26-size frequency array and <code>maxFreq</code> of any single character in the current window. If <code>(right - left + 1) - maxFreq > k</code>, more than <code>k</code> replacements are needed, so shrink from left by incrementing <code>left</code> and decrementing <code>count[s[left]]</code>.
    </details>

- [ ] **[Longest Substring Without Repeating Characters](./longestSubstringWithoutRepeating.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(\min(N, \Sigma))$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Store the last seen index of each character in a map. When duplicate character <code>c</code> appears in the window, jump <code>left = lastSeen[c] + 1</code>.
    </details>

- [ ] **[Minimum Size Subarray Sum](./minSubArrayLen.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Expand the window by advancing <code>right</code> and accumulating <code>currentSum</code>. Whenever <code>currentSum >= target</code>, update the minimal length and shrink the window from the left by subtracting <code>nums[left++]</code>.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>4. ⚡ Prefix Sums & Hashing (5 Problems)</h3></summary>

> **Pattern Essence:** Cumulative aggregations enable $\mathcal{O}(1)$ range queries and frequency-based subarray identification.

- [ ] **[Group Anagrams](./groupAnagrams.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N \cdot K \log K)$ time \| $\mathcal{O}(N \cdot K)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort the characters of each string to form a canonical key (e.g., "eat" -> "aet"). Use a <code>HashMap&lt;String, List&lt;String&gt;&gt;</code> to collect all matching words under the same key.
    </details>

- [ ] **[Subarray Sum Equals K](./subArraySumK.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(N)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain a running sum. If <code>runningSum - K</code> exists in the prefix map, add its frequency to the total count.
    </details>

- [ ] **[Longest Consecutive Sequence](./longestConsecutive.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(N)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Insert all items into a <code>HashSet</code>. Only start counting streaks when <code>num - 1</code> is not in the set to guarantee linear overall work.
    </details>

- [ ] **[Product of Array Except Self](./productExceptSelf.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ auxiliary space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Compute prefix products in a forward pass, then multiply by a running suffix product in a backward pass without division.
    </details>

- [ ] **[Sum of Array Except Self](./sumArrExpSelf.java)** `🟢 Easy`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Calculate total array sum first, then assign <code>result[i] = totalSum - nums[i]</code>.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>5. 🔄 2D Matrix & Grids (3 Problems)</h3></summary>

> **Pattern Essence:** Transform and traverse 2D arrays with constant space in-place manipulation.

- [ ] **[Set Matrix Zeroes](./setMatrixZeroes.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(M \times N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Track whether the first row and first column need to be zeroed with boolean flags. Then use the first row and column as markers for the rest of the matrix. Update cells in a second pass, and finally zero out the first row/column if flagged.
    </details>

- [ ] **[Rotate Matrix by 90° Clockwise](./rotateMatrix.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N^2)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    1. Transpose the matrix across the main diagonal (<code>swap(matrix[i][j], matrix[j][i])</code>).<br/>
    2. Reverse each row horizontally using two pointers.
    </details>

- [ ] **[Spiral Matrix Traversal](./spiralMatrix.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(M \times N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain four boundary pointers (<code>top</code>, <code>bottom</code>, <code>left</code>, <code>right</code>) and simulate inward clockwise steps while updating limits.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>6. ⏱️ Intervals & Sorting (3 Problems)</h3></summary>

> **Pattern Essence:** Order intervals chronologically to resolve overlap conflicts in linear sweeps.

- [ ] **[Insert Interval](./insertInterval.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(N)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Traverse linearly in three stages: 1) add intervals ending before <code>newInterval</code> starts, 2) merge overlapping intervals into <code>newInterval</code> by expanding bounds, 3) append remaining intervals after <code>newInterval</code> ends.
    </details>

- [ ] **[Merge Overlapping Intervals](./mergeIntervals.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N \log N)$ time \| $\mathcal{O}(N)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort intervals by start coordinate. If current interval overlaps with previous (<code>prev.end >= curr.start</code>), merge by setting <code>prev.end = max(prev.end, curr.end)</code>.
    </details>

- [ ] **[Non-overlapping Intervals](./eraseOverlapIntervals.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N \log N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Sort intervals by end time. If <code>intervals[i][0] < prevEnd</code>, an overlap exists—greedily drop the current interval (increment removal count) to maximize remaining space. Otherwise, update <code>prevEnd = intervals[i][1]</code>.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>7. 💡 Greedy, Dynamic Programming & Permutations (8 Problems)</h3></summary>

> **Pattern Essence:** Local optimal choices lead to global solutions with minimal space overhead.

- [ ] **[Best Time to Buy and Sell Stock](./maxProfit.java)** `🟢 Easy`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain <code>minPrice</code> seen so far in a single forward pass. At each day, update <code>maxProfit = max(maxProfit, prices[i] - minPrice)</code> and greedily update <code>minPrice = min(minPrice, prices[i])</code>.
    </details>

- [ ] **[Coin Change](./coinChange.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N \cdot \text{amount})$ time \| $\mathcal{O}(\text{amount})$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Build an array <code>dp[0..amount]</code> initialized with a sentinel (<code>amount + 1</code>). For each amount <code>i</code> and coin denomination, update <code>dp[i] = min(dp[i], dp[i - coin] + 1)</code>.
    </details>

- [ ] **[House Robber](./houseRobber.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain two running variables for max loot up to two houses back (<code>prev2</code>) and up to previous house (<code>prev1</code>). At each step, choose <code>current = max(prev1, prev2 + nums[i])</code>.
    </details>

- [ ] **[Gas Station](./gasStation.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Keep running <code>currentGas</code> and overall totals. If <code>totalGas < totalCost</code>, the circuit is impossible (return -1). Whenever <code>currentGas < 0</code>, reset <code>startIndex = i + 1</code> and <code>currentGas = 0</code>.
    </details>

- [ ] **[Jump Game](./jumpGame.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain a running <code>maxReach</code>. At each index <code>i</code>, if <code>i > maxReach</code>, return false. Otherwise update <code>maxReach = max(maxReach, i + nums[i])</code> and return true if <code>maxReach >= n - 1</code>.
    </details>

- [ ] **[Maximum Subarray Sum (Kadane's Algorithm)](./maxSubArray.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Accumulate <code>currentSum</code>. Update <code>maxSum = max(maxSum, currentSum)</code>. If <code>currentSum < 0</code>, reset it to 0.
    </details>

- [ ] **[Majority Element (Boyer-Moore Voting)](./majorityElement.java)** `🟢 Easy`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Maintain <code>candidate</code> and <code>count</code>. Increment when matching candidate, decrement when different. Majority element cancels all others.
    </details>

- [ ] **[Next Permutation](./nextPermutation.java)** `🟡 Medium`
  - **Complexity:** $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
  - <details><summary>💡 <b>Quick Hint & Intuition</b></summary>
    Find first decreasing element from right (pivot), swap with element just larger than it from the right, then reverse everything after pivot.
    </details>

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>8. 🧱 Array Fundamentals & Linear Traversal (12 Problems)</h3></summary>

> **Pattern Essence:** Core mechanics of indexing, digit math, element comparisons, and single-pass queries.

- [ ] **[Rotate Array by K Steps](./rot.java)** `🟢 Easy` — $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space (Triple reversal trick)
- [ ] **[Second Largest Element](./secLar.java)** `🟢 Easy` — $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space (Single pass two-variable tracking)
- [ ] **[Dominant Index (At Least Twice as Large)](./lestTwice.java)** `🟢 Easy` — $\mathcal{O}(N)$ time \| $\mathcal{O}(1)$ space
- [ ] **[Array Adding (Large Number Arithmetic)](./arrAdd.java)** `🟢 Easy` — $\mathcal{O}(\max(N_1, N_2))$ time (Digit carry addition)
- [ ] **[Array Subtracting (Large Number Arithmetic)](./arrSub.java)** `🟡 Medium` — $\mathcal{O}(\max(N_1, N_2))$ time (Digit borrow subtraction)
- [ ] **[Basic Array Operations](./arrOp.java)** `🟢 Easy` — Sum, floor average, and traversal
- [ ] **[Largest Element Index](./arrPr1.java)** `🟢 Easy` — Linear scan for maximum value index
- [ ] **[Count Above Threshold (> 35)](./arrPr2.java)** `🟢 Easy` — Conditional count filter
- [ ] **[Compare Sum of Two Arrays](./arrPr3.java)** `🟢 Easy` — Sum comparison between arrays
- [ ] **[Consecutive Pairs Sum to K](./arrPr4.java)** `🟢 Easy` — Sliding adjacent pair check
- [ ] **[Last Occurrence Index](./lastOcc.java)** `🟢 Easy` — Backward or forward linear search
- [ ] **[All Indices of Target Element](./lenSer1.java)** `🟢 Easy` — 1-based indexing collector

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>9. 🔢 Math & Number Theory (3 Problems)</h3></summary>

- [ ] **[Armstrong Numbers in Range](./armStrNum.java)** `🟢 Easy` — Sum of $D$-th powers of digits
- [ ] **[Primality Test](./isprime.java)** `🟢 Easy` — $\mathcal{O}(\sqrt{N})$ trial division
- [ ] **[Combinations (nCr)](./ncr.java)** `🟢 Easy` — Combinatorial computation $\frac{n!}{r!(n-r)!}$

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

<details open>
<summary><h3>10. ✨ Pattern Printing & Geometry (6 Problems)</h3></summary>

- [ ] **[Diamond Star Pattern](./dimPat.java)** `🟢 Easy` — Symmetrical diamond for odd height $N$
- [ ] **[Continuous Cyclic Characters](./contCharPat.java)** `🟢 Easy` — Cyclic alphabet wrapper ($Z \rightarrow A$)
- [ ] **[Character Pattern Grid](./charPat.java)** `🟢 Easy` — 2D character box patterns
- [ ] **[Descending Number Pattern](./priNum.java)** `🟢 Easy` — Line $i$ prints from $i$ down to $1$
- [ ] **[Right-Angled Fibonacci Triangle](./rigAnFib.java)** `🟢 Easy` — Fibonacci sequence arranged triangularly
- [ ] **[Array Building Bar Chart](./arrBuilding.java)** `🟢 Easy` — Vertical asterisk bar visualization

[⬆ Back to Top](#-data-structures--algorithms-dsa-interactive-master-guide)
</details>

---

## 💻 How to Compile & Run

All solutions are standalone executable Java programs with standard `main` driver functions.

### Compile Any Problem
```bash
javac sort012.java
```

### Run with Direct Input
```bash
java sort012
# Then provide problem input via terminal
```

### Run with Pipe / Test Cases (PowerShell)
```powershell
echo "5`n2 0 2 1 1 0" | java sort012
# Output: 0 0 1 1 2 2
```

---

<div align="center">
⭐ <i>Star this repository to follow along with daily DSA additions and interview patterns!</i>
</div>
