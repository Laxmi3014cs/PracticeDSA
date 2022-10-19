package com.practice;

import java.util.Scanner;


public class PrimeNumbersSmallerThanNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrimeNumbers(n);
    }

    private static void printPrimeNumbers(int n) {
        for(int i=2;i<=n;i++){
            if(isPrime(i))
                System.out.print(i+" ");
        }
    }

    private static boolean isPrime(int i) {
        if(i==2 || i==3)
            return true;
        if(i%2 ==0 || i%3 ==0)
            return false;
        for(int j=5;j<Math.sqrt(i);i=i+6){
            if(i%j == 0)
                return false;
        }
        return true;
    }
}




















































