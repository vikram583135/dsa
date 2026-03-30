
/*
Array Subtracting
You have given a number n1, representing the size of array arr1. You have given n1 numbers, representing elements of array arr1. You have given a number n2, representing the size of array arr2.You have given n2 numbers, representing elements of array arr2. The two arrays represent digits of two numbers.

You are required to subtract the numbers represented by two arrays and print the arrays. n1 and n2 can be of different sizes

You need to calculate arr1 - arr2 (the number represented by arr1 minus the number represented by arr2).

Input Format
First line consists of an integer n1

Second line consists of n1 spaced integers, representing elements of arr1

Third line consists of an integer n2

Fourth line consists of n2 spaced integers, representing elements of arr2

Output Format
Subtract the two numbers and print the array

Example 1
Input

3
3 2 1
3
1 2 3
Output

1
9
8
Explanation

321 - 123 = 198

Example 2
Input

4
1 2 3 4
2
2 1
Output

1
2
1
3
Explanation

1234 - 21 = 1213

Constraints
1 <= n1, n2 <= 10

0 <= a1[i], a2[i] < 10
*/// Java program to sum two numbers
// represented two arrays.
import java.util.*;

public class arrSub {

  static int[] subtract(int[] arr1, int[] arr2) {
    // 1. Determine which array represents the larger number
    boolean isNegative = false;
    int[] a1 = arr1;
    int[] a2 = arr2;

    if (isSecondLarger(arr1, arr2)) {
        isNegative = true;
        a1 = arr2; // Swap: now a1 is the larger one
        a2 = arr1;
    }

    // 2. Perform subtraction (a1 - a2) where a1 >= a2
    int n1 = a1.length;
    int n2 = a2.length;
    int[] temp = new int[n1];
    int borrow = 0;

    int i = n1 - 1;
    int j = n2 - 1;

    while (i >= 0) {
        int d1 = a1[i];
        int d2 = (j >= 0) ? a2[j] : 0;
        int sub = d1 - d2 - borrow;

        if (sub < 0) {
            sub += 10;
            borrow = 1;
        } else {
            borrow = 0;
        }
        temp[i] = sub;
        i--;
        j--;
    }

    // 3. Trim leading zeros
    int start = 0;
    while (start < temp.length && temp[start] == 0) {
        start++;
    }

    if (start == temp.length) return new int[]{0};

    // 4. Build final result and apply negative sign if needed
    int[] res = new int[temp.length - start];
    for (int k = 0; k < res.length; k++) {
        res[k] = temp[start + k];
    }

    if (isNegative) {
        res[0] = res[0] * -1; // Make the first digit negative
    }

    return res;
}

// Helper function to compare two array-represented numbers
static boolean isSecondLarger(int[] a1, int[] a2) {
    if (a1.length < a2.length) return true;
    if (a1.length > a2.length) return false;
    for (int i = 0; i < a1.length; i++) {
        if (a1[i] < a2[i]) return true;
        if (a1[i] > a2[i]) return false;
    }
    return false; // They are equal
}

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    int[] res = subtract(arr1, arr2);
    for (int i : res) System.out.println(i);
  }
}