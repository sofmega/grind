package org.exercice;

import java.util.Scanner;
//Convert a decimal number to binary using loops.
public class decimal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("Binary: 0");
        } else {
            String b = "";
            for (int i = n; i > 0; i = i / 2) {
                int r = i % 2;
                b = r + b;


            }
            System.out.println("Binary: " + b);
        }
    }
}
