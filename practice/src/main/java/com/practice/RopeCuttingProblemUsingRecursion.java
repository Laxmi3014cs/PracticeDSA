package com.practice;

import java.util.Scanner;

public class RopeCuttingProblemUsingRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(printResult(n,a,b,c));

    }

    private static int printResult(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<0)
            return -1;
        int res = Math.max(printResult(n-a,a,b,c),Math.max(printResult(n-b,a,b,c),printResult(n-c,a,b,c)));
        if(res == -1)
            return -1;
        else
            return res+1;
        //Time Complexity O(3^n)
    }
}
