Toggling k-th bit

For a given number n, if k-th bit is 0, then toggle it to 1 and if it is 1 then, toggle it to 0.


Input Format

Single line containing integer n and k.

*****

import java.util.*;

public class Main {

    public static long toggleBit(long n, long k) {
      return n^(1L << k-1);
      
}

    // Main function below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(toggleBit(n, k));
            System.out.println("~");
        }
    }
}
  
*****

Examples

Example 1

Input:


n = 6, k = 1

Output:


7

Explanation:
6 is represented as 110 in binary and has its first bit 0, so toggling  it will result in 111 i.e. 7.
