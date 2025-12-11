XOR Sum
Given two integers A and B, find the minimum possible value of:


(A ⊕ X) + (B ⊕ X)


for any integer X.


⊕ denotes bitwise XOR.


Input Format

First line: integer A


Second line: integer B

*****

import java.util.*;

public class Main {

    public static long xorSum(long A, long B) {
      int sum = 0;
      sum += A ^ B;
      return sum;
}

// Main function below
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long A = sc.nextLong();
            long B = sc.nextLong();
            System.out.println(xorSum(A, B));
            System.out.println("~");
        }
    }
}

*****

Input:

A = 4
B = 6

Output:

2
