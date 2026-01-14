package org.exercice;

import java.util.Scanner;
//Generate the first N numbers of Fibonacci.
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int prev1 = 0;
        int prev2 = 1;
        int x = sc.nextInt();
        int f = 0;
        for (int i = 1;i <= x ; i++){
            f = prev1  + prev2 ;
            System.out.println(f);
            prev2= prev1;
            prev1 = f;




        }
    }
}
