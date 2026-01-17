package org.exercice;

import java.util.Scanner;
// Longest increasing sequence
public class longestseq {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int prev = 0;
        int r = 0;
        int prevr = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {

            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            if (r == 0) {
                r = 1;
                prevr = 1;
            } else {
                if (prev < n) {
                    r++;
                } else {
                    if (r > prevr) {
                        prevr = r;
                    }
                    r = 1;
                }
            }

            prev = n;
        }


        if (r > prevr) {
            prevr = r;
        }

        System.out.println("Longest increasing consecutive sequence length = " + prevr);
        sc.close();
    }
}
