Count the Number of Set Bits
  
Given an integer n, return the number of set bits (1s) in its binary representation.
Can you solve it in O(log n) time complexity?


Input Format

A single line containing integer n.

*****

import java.util.Scanner;

public class Main {
    public static int countSetBits(int n) {
        int c = 0;
      while(n!=0){
        int rem = n%2;
        if(rem == 1) c++;
        n/=2;
      }
      return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(countSetBits(n));
            System.out.println("~");
        }
        sc.close();
    }
}
  
*****
Examples

Example 1

Input:

n = 5

Output:

2

Explanation:
The binary representation of 5 is 101, which has 2 set bits.
