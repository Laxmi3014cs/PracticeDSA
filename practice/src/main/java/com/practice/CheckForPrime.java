package com.practice;

import java.util.Scanner;

public class CheckForPrime {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(prime(n));
        System.out.println(optimisedPrime(n));
        System.out.println(moreOptimisedPrime(n));
    }

    private static boolean moreOptimisedPrime(int n) {
        if(n==0 || n==1 )
            return false;
        if(n==2 || n==3)
            return true;
        if(n%2 == 0 || n%3 ==0)
            return false;
        for(int i=5;i<=Math.sqrt(n);i=i+2){
            if(n%i == 0)
                return false;
        }
        return true;
    }

    private static boolean optimisedPrime(int n) {
        if(n==0 || n==1 )
            return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0)
                return false;
        }
        return true;
        //Time Complexity O(Squareroot(n))
    }

    private static boolean prime(int n) {
        if(n==0 || n==1)
            return false;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;

            }

        }
        return true;
        //Time Complexity O(n)
    }


}
