Set the Rightmost Unset Bit
Given a non-negative number n . The problem is to set the rightmost unset bit in the binary representation of n.


Input Format

First line: integer n

*****

import java.util.*;

class Main {
    public static long setRightmostUnsetBit(long n) {
      return n|n+1;
}
// Main function below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            System.out.println(setRightmostUnsetBit(n));
            System.out.println("~");
        }
    }
}

  
*****

Examples

Example 1

Input:


n = 6

Output:


7
