package com.practice;

import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(n&m);
        System.out.println(n|m);
        System.out.println(n^m);
        System.out.println(~n);
        System.out.println(~m);
        System.out.println(n<<2);
        System.out.println(n>>2);
        System.out.println(n>>>2);
    }
}
