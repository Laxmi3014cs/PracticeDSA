package com.practice;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long fact = 1;
        for(int i=n;i>0;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        //Time Complexity O(n) theta 1 auxilary space
        System.out.println(factorial(n));

    }

    private static long factorial(int n) {
        if(n==0)
            return 1;
        return n * factorial(n-1);
        //Time complexity O(n) theta n auxilary space
    }
}
