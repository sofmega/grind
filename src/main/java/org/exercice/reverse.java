package org.exercice;

import java.util.Scanner;

//Write a program that reverses a number (example: 1234 → 4321).
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter x : ");

        int x = sc.nextInt();
        int n = 0;

                int r = 0;
                int b = 0;
                for ( ; x > 0 ; x= x / 10){
                    r = x % 10 ;
                    b = b * 10 + r;
                    System.out.println("r :"+r);
                    System.out.println("b : "+ b);
                }
            }
        }
