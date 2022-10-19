package com.practice;

import java.util.Scanner;

public class SubsetsofGivenStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n =str.length();
        int len = (int) Math.pow(2,n);
        for(int i=0;i<len;i++){
            for(int j=0;j<n;j++){
                if((i &(1<<j))!=0)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }

    }
}
