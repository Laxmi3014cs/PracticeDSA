package com.practice;

import java.util.Scanner;

public class CountDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        int count =0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println(count);

        //Time complexity O(d)
    }
}
