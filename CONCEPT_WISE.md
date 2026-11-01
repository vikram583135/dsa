# 🗂️ Concept-Wise Problem Index

A clean, concept-based organization of all problem files in this repository.
Each entry links to its standalone Java solution.

---

## 📊 Overview

| Concept | # Problems | Files |
| :--- | :---: | :--- |
| Array Basics & Linear Scans | 11 | `arrPr1`, `secLar`, `lestTwice`, `arrPr2`, `arrPr3`, `arrOp`, `lastOcc`, `lenSer1`, `rot`, `arrAdd`, `arrSub` |
| Two Pointers & Pair/Triplet Scanning | 8 | `sort012`, `containerWithMostWater`, `threeSum`, `fourSum`, `trappingRainWater`, `diffPairs`, `diviSUmPairMain`, `triplet` |
| Binary Search | 3 | `searchRotatedSortedArray`, `search2DMatrix`, `findPeakElement` |
| Sliding Window | 2 | `longestSubstringWithoutRepeating`, `minSubArrayLen` |
| Prefix Sums, Hashing & Running Aggregates | 4 | `subArraySumK`, `longestConsecutive`, `productExceptSelf`, `sumArrExpSelf` |
| 2D Matrix & Grids | 3 | `setMatrixZeroes`, `rotateMatrix`, `spiralMatrix` |
| Intervals & Sorting | 2 | `mergeIntervals`, `insertInterval` |
| Greedy & Kadane's-Style | 3 | `gasStation`, `jumpGame`, `maxSubArray` |
| Voting, Permutation & Combinatorial Tricks | 2 | `majorityElement`, `nextPermutation` |
| Math & Number Theory | 3 | `isprime`, `armStrNum`, `ncr` |
| Pattern Printing & Geometry | 6 | `dimPat`, `contCharPat`, `charPat`, `priNum`, `rigAnFib`, `arrBuilding` |

**Total:** 48 problems · 🟢 Easy 24 · 🟡 Medium 23 · 🔴 Hard 1

---

## 1. 🧱 Array Basics & Linear Scans

> Single-pass traversal, max/min tracking, indexing, counting, and digit-level array arithmetic.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`arrPr1.java`](./arrPr1.java) | 🟢 Easy | O(N) time \| O(1) space | Index of largest element (0-based, smallest tie index) |
| [`secLar.java`](./secLar.java) | 🟢 Easy | O(N) time \| O(1) space | Second largest element in a single pass |
| [`lestTwice.java`](./lestTwice.java) | 🟢 Easy | O(N) time \| O(1) space | Dominant index (element ≥ 2× every other) |
| [`arrPr2.java`](./arrPr2.java) | 🟢 Easy | O(N) time \| O(1) space | Count elements greater than threshold (35) |
| [`arrPr3.java`](./arrPr3.java) | 🟢 Easy | O(N) time \| O(1) space | Compare sum of two arrays |
| [`arrOp.java`](./arrOp.java) | 🟢 Easy | O(N) time \| O(1) space | Sum, floor average, and traversal basics |
| [`lastOcc.java`](./lastOcc.java) | 🟢 Easy | O(N) time \| O(1) space | Last occurrence index of target |
| [`lenSer1.java`](./lenSer1.java) | 🟢 Easy | O(N) time \| O(1) space | All indices of target (1-based collector) |
| [`rot.java`](./rot.java) | 🟢 Easy | O(N) time \| O(1) space | Rotate array by K (triple reversal trick) |
| [`arrAdd.java`](./arrAdd.java) | 🟢 Easy | O(max(N₁, N₂)) | Large-number addition with digit carry |
| [`arrSub.java`](./arrSub.java) | 🟡 Medium | O(max(N₁, N₂)) | Large-number subtraction with digit borrow |

---

## 2. 🎯 Two Pointers & Pair/Triplet Scanning

> Advance two or more indices toward each other or in lockstep to avoid quadratic brute force.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`sort012.java`](./sort012.java) | 🟡 Medium | O(N) time \| O(1) space | Dutch National Flag — low/mid/high pointers |
| [`containerWithMostWater.java`](./containerWithMostWater.java) | 🟡 Medium | O(N) time \| O(1) space | Shrink from both ends; move the shorter line |
| [`threeSum.java`](./threeSum.java) | 🟡 Medium | O(N²) time \| O(1) space | Sort + fix one element + two-pointer scan |
| [`fourSum.java`](./fourSum.java) | 🟡 Medium | O(N³) time \| O(1) space | Sort + two nested loops + two pointers (use `long`) |
| [`trappingRainWater.java`](./trappingRainWater.java) | 🔴 Hard | O(N) time \| O(1) space | leftMax/rightMax boundary pointers |
| [`diffPairs.java`](./diffPairs.java) | 🟢 Easy | O(N log N) time \| O(1) space | Pairs with difference K |
| [`diviSUmPairMain.java`](./diviSUmPairMain.java) | 🟢 Easy | O(N²) / O(N) time \| O(1) space | Pair sum divisible by K |
| [`triplet.java`](./triplet.java) | 🟡 Medium | O(N³) / O(N²) time \| O(1) space | Geometric progression triplets (b² = a·c) |

---

## 3. 🔍 Binary Search

> Halve the search domain each iteration on sorted arrays, partitioned spaces, or monotonic answer ranges.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`searchRotatedSortedArray.java`](./searchRotatedSortedArray.java) | 🟡 Medium | O(log N) time \| O(1) space | One half is always sorted — discard the other |
| [`search2DMatrix.java`](./search2DMatrix.java) | 🟡 Medium | O(log(M×N)) time \| O(1) space | Map `mid` → `row = mid / N`, `col = mid % N` |
| [`findPeakElement.java`](./findPeakElement.java) | 🟡 Medium | O(log N) time \| O(1) space | Compare `nums[mid]` vs `nums[mid+1]` |

---

## 4. 🪟 Sliding Window

> Expand and contract dynamic windows to track contiguous substring/subarray properties in single passes.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`longestSubstringWithoutRepeating.java`](./longestSubstringWithoutRepeating.java) | 🟡 Medium | O(N) time \| O(min(N, Σ)) space | Last-seen map; jump `left = lastSeen[c] + 1` |
| [`minSubArrayLen.java`](./minSubArrayLen.java) | 🟡 Medium | O(N) time \| O(1) space | Shrink window while `currentSum ≥ target` |

---

## 5. ⚡ Prefix Sums, Hashing & Running Aggregates

> Cumulative aggregations enable O(1) range queries and frequency-based subarray identification.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`subArraySumK.java`](./subArraySumK.java) | 🟡 Medium | O(N) time \| O(N) space | Running sum − K exists in prefix map? |
| [`longestConsecutive.java`](./longestConsecutive.java) | 🟡 Medium | O(N) time \| O(N) space | HashSet; only start streaks when `num−1` absent |
| [`productExceptSelf.java`](./productExceptSelf.java) | 🟡 Medium | O(N) time \| O(1) auxiliary space | Prefix pass × suffix pass, no division |
| [`sumArrExpSelf.java`](./sumArrExpSelf.java) | 🟢 Easy | O(N) time \| O(1) space | `result[i] = totalSum − nums[i]` |

---

## 6. 🔄 2D Matrix & Grids

> Transform and traverse 2D arrays with constant-space in-place manipulation.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`setMatrixZeroes.java`](./setMatrixZeroes.java) | 🟡 Medium | O(M×N) time \| O(1) space | First row/col as markers + flags |
| [`rotateMatrix.java`](./rotateMatrix.java) | 🟡 Medium | O(N²) time \| O(1) space | Transpose → reverse each row |
| [`spiralMatrix.java`](./spiralMatrix.java) | 🟡 Medium | O(M×N) time \| O(1) space | top/bottom/left/right boundary traversal |

---

## 7. ⏱️ Intervals & Sorting

> Order intervals chronologically to resolve overlap conflicts in linear sweeps.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`insertInterval.java`](./insertInterval.java) | 🟡 Medium | O(N) time \| O(N) space | Add left + merge overlapping + add right |
| [`mergeIntervals.java`](./mergeIntervals.java) | 🟡 Medium | O(N log N) time \| O(N) space | Sort by start; merge when `prev.end ≥ curr.start` |

---

## 8. 💡 Greedy & Kadane's-Style Single-Pass Optimizations

> Local optimal choices lead to global solutions with minimal space overhead.

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`gasStation.java`](./gasStation.java) | 🟡 Medium | O(N) time \| O(1) space | Total check + reset `startIndex` when `currentGas < 0` |
| [`jumpGame.java`](./jumpGame.java) | 🟡 Medium | O(N) time \| O(1) space | Track `maxReach`; fail if `i > maxReach` |
| [`maxSubArray.java`](./maxSubArray.java) | 🟡 Medium | O(N) time \| O(1) space | Kadane's: reset `currentSum` on negative runs |

---

## 9. 🗳️ Voting, Permutation & Combinatorial Tricks

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`majorityElement.java`](./majorityElement.java) | 🟢 Easy | O(N) time \| O(1) space | Boyer-Moore voting — cancel non-candidates |
| [`nextPermutation.java`](./nextPermutation.java) | 🟡 Medium | O(N) time \| O(1) space | Find pivot → swap with next larger → reverse suffix |

---

## 10. 🔢 Math & Number Theory

| File | Difficulty | Complexity | Essence |
| :--- | :---: | :--- | :--- |
| [`isprime.java`](./isprime.java) | 🟢 Easy | O(√N) | Trial division up to √N |
| [`armStrNum.java`](./armStrNum.java) | 🟢 Easy | O(D · 10^D) | Sum of D-th powers of digits |
| [`ncr.java`](./ncr.java) | 🟢 Easy | O(r) | Combinations nCr = n! / (r!(n−r)!) |

---

## 11. ✨ Pattern Printing & Geometry

| File | Difficulty | Essence |
| :--- | :---: | :--- |
| [`dimPat.java`](./dimPat.java) | 🟢 Easy | Symmetrical diamond for odd height N |
| [`contCharPat.java`](./contCharPat.java) | 🟢 Easy | Cyclic alphabet wrapper (Z → A) |
| [`charPat.java`](./charPat.java) | 🟢 Easy | 2D character box patterns |
| [`priNum.java`](./priNum.java) | 🟢 Easy | Line i prints from i down to 1 |
| [`rigAnFib.java`](./rigAnFib.java) | 🟢 Easy | Fibonacci sequence arranged triangularly |
| [`arrBuilding.java`](./arrBuilding.java) | 🟢 Easy | Vertical asterisk bar chart visualization |

---

## ✅ Summary

| Category | Easy | Medium | Hard | Total |
| :--- | :---: | :---: | :---: | :---: |
| Array Basics & Linear Scans | 10 | 1 | — | 11 |
| Two Pointers & Pair/Triplet | 2 | 5 | 1 | 8 |
| Binary Search | — | 3 | — | 3 |
| Sliding Window | — | 2 | — | 2 |
| Prefix Sums & Hashing | 1 | 3 | — | 4 |
| 2D Matrix & Grids | — | 3 | — | 3 |
| Intervals & Sorting | — | 2 | — | 2 |
| Greedy & Kadane's | — | 3 | — | 3 |
| Voting / Permutation Tricks | 1 | 1 | — | 2 |
| Math & Number Theory | 3 | — | — | 3 |
| Pattern Printing & Geometry | 6 | — | — | 6 |
| **Total** | **24** | **23** | **1** | **48** |
