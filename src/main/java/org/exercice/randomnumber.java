package org.exercice;

import java.util.Scanner;

public class randomnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = (int)(Math.random() * 100) + 1;
        for ( ; ;) {
            int x = sc.nextInt();
            if (n == x){
                System.out.println("correct");
            } else if (n > x) {
                System.out.println("too small");

            } else {
                System.out.println("Too big");
            }

        }
    }
}
