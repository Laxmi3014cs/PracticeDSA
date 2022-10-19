package com.practice;

import java.util.Scanner;

public class TwoOddAccuringNumbersinArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int xor=arr[0];
        for(int i=1;i<n;i++){
            xor = xor^arr[i];
        }
        int temp = (xor)&(~(xor-1));
        int res1=0,res2=0;
        for(int i=0;i<n;i++){
            if((temp & arr[i])!=0){
                res1 = res1^arr[i];
            }
            else{
                res2 = res2^arr[i];
            }
        }
        System.out.println(res1+" "+res2);
    }
}
