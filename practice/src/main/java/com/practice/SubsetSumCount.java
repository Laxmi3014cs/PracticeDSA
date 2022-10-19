package com.practice;

import java.util.Scanner;

public class SubsetSumCount {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(countOfSubsets(arr,n,k));
    }

    private static int countOfSubsets(int[] arr, int n, int k) {
        if(n==0)
            return (k==0)?1:0;
        return countOfSubsets(arr,n-1,k) + countOfSubsets(arr,n-1,k-arr[n-1]);
        //Time Complexity 2^n
    }
}
