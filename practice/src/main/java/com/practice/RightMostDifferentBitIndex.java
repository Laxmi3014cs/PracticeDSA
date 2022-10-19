package com.practice;

import java.util.Scanner;

/*
Given two numbers M and N. The task is to find the position of the rightmost different bit in the binary representation of numbers.
 */
public class RightMostDifferentBitIndex {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int n = a^b;
        int m = ~n+1;
        int res = n&m;
        int pos = (int)((Math.log(res))/Math.log(2));
        System.out.println(pos+1);
    }
}
