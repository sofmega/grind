package org.exercice;

import java.util.Scanner;
// Write a program that keeps asking for a password until it is correct (max 3 tries).
public class password {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password : ");

        for (int i = 1; i <= 3 ; i++) {
            int x = sc.nextInt();
            if (x == 965){
                System.out.println("Password correct");
                break;
            }
            else{
                System.out.println("Password incorrected");
            }
        }
    }
}
