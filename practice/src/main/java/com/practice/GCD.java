package com.practice;

import java.util.Scanner;

public class GCD {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = Math.min(n,m);
        while(res > 0){
            if(n % res == 0 && m%res ==0){
                break;
            }
            res--;
        }
        System.out.println(res);
        //Time Complexity theta (min(n,m))
        System.out.println(gcd(n,m));
        System.out.println(gcdOptimised(n,m));
    }

    private static int gcdOptimised(int n, int m) {
        if(m==0)
            return n;
        else
            return gcdOptimised(m,n%m);

    }

    private static int gcd(int n, int m) {
        while(n != m){
            if(n>m)
                n = n-m;
            else
                m = m-n;
        }
        return n;

    }
}
