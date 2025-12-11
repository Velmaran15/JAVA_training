Set kth bit
Given a number n and a value k. From the right, set the kth bit in the binary representation of n. The position of the Least Significant Bit(or last bit) is 0, the second last bit is 1 and so on.


Input Format

Single line containing integer n and k.

*****

import java.util.*;

public class Main {

    public static long setBit(long n, long k) {
      long m = n&(1<<k);
      if(m == 0) return n|(1L<<k);   //1L means converting the integer 1 into long (typecasting)
      return n;
}

    // Main function below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(setBit(n, k));
            System.out.println("~");
        }
    }
}

  
*****
  
Examples

Example 1

Input:


n = 10, k = 2

Output:


14
