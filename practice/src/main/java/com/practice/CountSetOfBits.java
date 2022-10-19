package com.practice;

import java.util.Scanner;

public class CountSetOfBits {
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countBits(n));
    }

    private static int countBits(int n) {
        int res =0;
        while(n>0){
            if(n%2 !=0) //if((n&1)==1)
                res++;
            n=n/2;      //n>>2

        }
        return res;
        //Time Complexity theta of no.of bits in n
    }
}
