package org.exercice;

import java.util.Scanner;

public class pgcd {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n = sc.nextInt();
        System.out.println("Entre 2nd number");
        int b = sc.nextInt();
        int r = 0;
        for (int i =1 ; i <=  Math.min(n, b) ; i++){
                if (n % i == 0 && b % i == 0){
                r = i;
                }
            }
        System.out.println(r);
    }


    }
