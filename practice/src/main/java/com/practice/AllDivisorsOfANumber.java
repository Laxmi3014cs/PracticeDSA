package com.practice;

import java.util.Scanner;

public class AllDivisorsOfANumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        allDivisorsOfANumber(n);
        System.out.println();
        efficientAllDivisorsOfANumber(n);
    }

    private static void efficientAllDivisorsOfANumber(int n) {
        int i;
        for(i=1;i<Math.sqrt(n);i++){
            if(n%i ==0){
                System.out.print(i+" ");
            }
        }
        for(;i>=1;i--){
            if(n%i==0)
                System.out.print(n/i+" ");
        }
        //Time Complexity Theta sqrt(n)
    }

    private static void allDivisorsOfANumber(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        //Time Complexity Theata n
    }
}
