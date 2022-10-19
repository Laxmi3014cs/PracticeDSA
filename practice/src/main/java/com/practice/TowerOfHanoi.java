package com.practice;

import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSteps(n,'A','B','C');
    }

    private static void printSteps(int n, char a, char b, char c) {
        if(n==1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        printSteps(n-1,'a','c','b');
        System.out.println("Move "+n+" from "+ a +"to "+c);
        printSteps(n-1,'b','a','c');
        //Time Complexity theta 2^n -1
    }
}
