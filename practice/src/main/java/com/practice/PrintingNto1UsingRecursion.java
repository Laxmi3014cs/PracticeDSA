package com.practice;

import java.util.Scanner;

public class PrintingNto1UsingRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnUmbers(n);
        System.out.println();
        printNumbersfrom1toN(n);
    }

    private static void printNumbersfrom1toN(int n) {
        if(n==0)
            return;
        printNumbersfrom1toN(n-1);
        System.out.print(n+" ");
    }

    private static void printnUmbers(int n) {
        if(n==0)
            return;
        System.out.print(n+" ");
        printnUmbers(n-1);
    }
}
