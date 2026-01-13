package org.exercice;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number : ");
        int x = sc.nextInt();
        int max = 0 ;

        for ( ; x > 0 ; x = x / 10 ) {
            int d = x % 10 ;
            if (d > max  ){
                max = d;
            }
        }
        System.out.println(max);

    }
}
