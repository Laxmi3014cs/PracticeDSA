package com.practice;

import java.util.Scanner;

public class PrimeFactorsOfaNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeFactors(n);
        System.out.println();
        optimisedPrimeFactors(n);
    }

    private static void optimisedPrimeFactors(int n) {
        for(int i=2;i<Math.sqrt(n);i++){
            while(n%i ==0){
                System.out.print(i+" ");
                n = n/i;
            }
        }
        if(n>1)
            System.out.print(n);
    }

    private static void primeFactors(int n) {
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x=i;
                while(n%x==0){
                    System.out.print(i+" ");
                    x= x*i;
                }
            }
        }
    }

    private static boolean isPrime(int i) {
        if(i==2 || i==3)
            return true;
        if(i%2==0 || i%3==0){
            return false;
        }
        for(int j=5;j<Math.sqrt(i);j=j*5){
            if(i%j==0)
                return false;
        }
        return true;
    }
}

