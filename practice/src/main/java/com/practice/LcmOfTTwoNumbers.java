package com.practice;

import java.util.Scanner;

public class LcmOfTTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = Math.max(n,m);
        while(true){
            if(res % n == 0 && res%m == 0 ){
                break ;
            }
            res++;
        }
        System.out.println(res);
        //Time Complexity theta n*m - max(n,m)
        System.out.println(lcm(n,m));
    }

    private static int lcm(int n, int m) {
        int gcd = gcdOfTwoNumbers(n,m);
        return (n*m)/gcd;
    }

    private static int gcdOfTwoNumbers(int n, int m) {
        if(m==0)
            return n;
        else
           return gcdOfTwoNumbers(m,n%m);

    }
}
