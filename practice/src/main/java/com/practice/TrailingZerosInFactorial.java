package com.practice;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        Long fact = Long.valueOf(1);
        for(int i=n;i>0;i--){
            fact = fact * i;
        }
        System.out.println(fact);
        while (fact %10 ==0){
            count++;
            fact = fact/10;
        }
        System.out.println(count);
        //Time Complexity theta n
        System.out.println(trailingZeroCount(n));
    }

    private static int trailingZeroCount(int n) {
        int res =0;
        for(int i=5;i<n;i=i*5){
            res += n/i;
        }
        return res;
        //Time Complexity theta long n
    }
}
