package com.practice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =n;
        int sum =0;
        while(n != 0){
            int temp = n%10;
            sum =(sum*10) +temp;
            n = n/10;
        }
        if(sum == k)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        //Time Complexity : No of Digits

    }
}
