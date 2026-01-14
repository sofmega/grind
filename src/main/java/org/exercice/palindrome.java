package org.exercice;

import java.util.Scanner;
// Check if a number is a palindrome.
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 12321
        int reversed = 0;
            for (int i = n; i > 0; i /= 10) { // first degit
                reversed = reversed * 10 + (i  % 10);
            }
                if (n == reversed) {
                    System.out.println("This number is palindrome");
                } else {
                    System.out.println("This number is not palindrome");
                }

            }
    }
