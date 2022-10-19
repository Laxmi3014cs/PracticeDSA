package com.practice;

import java.util.Scanner;

/*
finding missing number in array from 1 to n+1
 */
public class FindingMissingoneOddAppearingNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int res=arr[0];
        for(int i=1;i<n;i++){
            res = res^arr[i];
        }
       // System.out.println(res);
        for(int i=1;i<=n+1;i++){
            res = res^i;
        }
        System.out.println(res);
    }
}
