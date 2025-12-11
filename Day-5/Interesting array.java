Interesting Array
 Solved
You are given an array A with N elements.


Two operations are allowed:


Split Operation


Split an element B into two elements C and D, such that:
B = C + D


Merge Operation


Merge two elements P and Q into one element R, such that:
R = P ^ Q (bitwise XOR)


Your task is to determine whether it is possible to convert the array into size 1, such that the only remaining element is 0, after performing zero or more splits and/or merges.


Print "YES" if it is possible, otherwise print "NO".


Input Format

First line contains an integer N — the number of elements in the array.


Second line contains N space-separated integers A[0], A[1], ..., A[N-1].

*****

import java.util.*;

public class Main {

    public static String canMakeZero(int[] a, int n) {
      int XOR = 0;
      for(int i:a){
        XOR ^= i;
      }
      if(XOR % 2 == 0) return "YES";
      return "NO";
}
  
// Main function below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println(canMakeZero(a, n));
            System.out.println("\n~");
        }
    }
}

******

Example 1

Input:


N = 4
A = [1, 2, 3, 4]

Output:


YES
