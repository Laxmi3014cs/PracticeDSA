package com.practice;

import java.util.Scanner;

public class JosephusProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(solutionOfJosephusOne(n,k));
    }

    private static int solutionOfJosephusOne(int n, int k) {
        return solutionOfJosephus(n,k)+1;
    }

    private static int solutionOfJosephus(int n, int k) {
        if(n==1){
            return 0;
        }
        else{
            return (solutionOfJosephus(n-1,k)+k)%n;
        }
    }
}
