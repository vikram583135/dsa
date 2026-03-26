/*
Array Problem 4
Write a program to find out the difference between sum of all the elements in two arrays arr1 and arr2.
If sum of all elements in arr1 is larger then, the output should be First array is larger,
if sum of all elements in arr2 is larger then, the output should be Second array is larger,
otherwise the output should be Both are equal.

Input Format
First line contains n, size of the first array.

Second line contains n elements of the first array.

Third line contains m, size of the second array.

Fourth line contains m elements of the second array.

n and m will always be equal.

Output Format
Print the output as per difference.

Example 1
Input

2
1 2
2
3 4
Output

Second array is larger
Explanation

Overall sum of first array is 1+2 = 3
Overall sum of second array is 3+4 = 7
Thus, second array is larger

Example 2
 */
import java.io.*;
import java.util.*;


public class arrPr3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
                arrA[i]=sc.nextInt();
        }
        
        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }
        
        System.out.println(ArrayProblem(arrA,arrB)); 
    }
    public static String ArrayProblem(int []arrA,int []arrB){
       // Write code here
       int a1Sum=0;
       int a2Sum=0;

       for(int i=0;i<arrA.length;i++)
       {
        a1Sum=a1Sum+arrA[i];
       }
       for(int i=0;i<arrB.length;i++)
       {
        a2Sum=a2Sum+arrB[i];
       }
       
       if(a1Sum>a2Sum)
       return ("First array is larger");
       else if(a2Sum>a1Sum)
       return ("Second array is larger");
       else
       return ("Both are equal");

       
    }
}