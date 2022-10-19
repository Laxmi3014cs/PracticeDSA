package com.practice;

import java.util.Scanner;

public class CheckPalindromeUsingRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(palindromeCheck(str,0,str.length()));
    }

    private static boolean palindromeCheck(String str, int i, int n) {
        if(i>=n)
            return true;
        return ((str.charAt(i)==str.charAt(n-1)) && palindromeCheck(str,i+1,n-1));
        //Time Complexity O(n) and Auxilary space O(n)
    }


}
