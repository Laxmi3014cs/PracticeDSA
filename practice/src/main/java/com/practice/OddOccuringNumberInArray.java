package com.practice;

import java.util.Scanner;

public class OddOccuringNumberInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(resultNumber(arr,n));
    }

    private static int resultNumber(int[] arr, int n) {
        int res = arr[0];
        for(int i=1;i<n;i++){
            res = res^arr[i];
        }
        return res;
    }
}
