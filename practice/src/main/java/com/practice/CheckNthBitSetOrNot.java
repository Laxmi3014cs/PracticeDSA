package com.practice;

import java.util.Scanner;

public class CheckNthBitSetOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        if(((1<<(k-1))&n)!=0){
            System.out.println("set");
        }
        else{
            System.out.println("Not Set");
        }

        if(((n>>(k-1))&1)==1){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }
    }
}
