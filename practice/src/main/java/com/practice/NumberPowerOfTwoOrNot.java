package com.practice;

import java.util.Scanner;

public class NumberPowerOfTwoOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(powOfTwo(n));
        System.out.println(efficientPowOfTwo(n));
    }

    private static boolean efficientPowOfTwo(int n) {
        if(n==0)
            return false;
        return ((n&(n-1))==0);
    }

    private static boolean powOfTwo(int n) {
        if(n==0)
            return false;
        while(n!=1){
            if(n%2!=0)
                return false;
            n=n/2;
        }
        return true;
    }
}
