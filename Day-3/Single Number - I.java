Single Number - I
Given an array of nums of n integers. Every integer in the array appears twice except one integer. Find the number that appeared once in the array.


Input Format

First line will contain an integer n – the number of elements in the array.
Second line will contain n space-separated integers – the elements of the array nums.

******

import java.util.Scanner;

public class Main {
    public static int findSingle(int[] nums) {
      int r = 0;
        for(int num:nums){
          r ^= num;
        }
      return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++)
                nums[i] = sc.nextInt();
            System.out.println(findSingle(nums));
            System.out.println("~");
        }
        sc.close();
    }
}

*****
  
Input:

n = 7 nums = [1, 2, 2, 4, 3, 1, 4]

Output:

3
