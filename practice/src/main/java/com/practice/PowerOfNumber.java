package com.practice;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(powerOfNumber(x,n));
        System.out.println(effectiveSolution(x,n));

    }

    private static int effectiveSolution(int x,int n) {
        int res =1;
        while(n>0){
            if(n%2 !=0)
                res = res*x;
            x = x*x;
            n = n/2;
        }
        return res;
        //Time Complexity Theta log(n)
    }

    private static int powerOfNumber(int x, int n) {
        int res=1;
        for(int i=1;i<=n;i++){
            res = res*x;
        }
        return res;
        //Time Complexity theata n
    }
}
