package com.practice;

import java.util.Scanner;

public class SubsetsOfGivenStringUsingRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printSubstrings(str,"",0);
    }

    private static void printSubstrings(String str, String s, int i) {
        if(i == str.length()){
            System.out.print(s+" ");
            return;
        }
        printSubstrings(str,s,i+1);
        printSubstrings(str,s+str.charAt(i),i+1);
    }
}
