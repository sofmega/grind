package org.exercice;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();

        int f = 0;
        for ( int i = 1 ; i <= x ; i++){
                if (x % i == 0){
                  f += 1;
                }


        }
        if (f == 2) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not prime");
        }

    }
}
