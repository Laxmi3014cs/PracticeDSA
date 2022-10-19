package com.practice;

import java.util.Scanner;

public class SumOfDigitsUsingRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printSum(n));
    }

    private static int printSum(int n) {
        if(n==0)
            return 0;
        return n%10 + printSum(n/10);
    }
}
