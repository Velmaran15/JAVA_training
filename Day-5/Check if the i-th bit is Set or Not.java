Check if the i-th bit is Set or Not
Given two integers n and i, return true if the ith bit in the binary representation of n (counting from the least significant bit, 0-indexed) is set (i.e., equal to 1). Otherwise, return false.


Input Format

A single line containing two integers, n and i, separated by a space.

*****

import java.util.Scanner;

public class Main {
    public static boolean isBitSet(int n, int i) {
      int m = n&(1<<i);
      if(m!=0) return true;
      return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int i = sc.nextInt();
            System.out.println(isBitSet(n, i));
            System.out.println("~");
        }
        sc.close();
    }
}

*****
  
Examples

Example 1

Input:


n = 5, i = 0

Output:


true
