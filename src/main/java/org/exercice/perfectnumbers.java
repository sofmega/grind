package org.exercice;

public class perfectnumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int r = 0;


            for (int n = 1; n < i; n++) {
                if (i % n == 0) {
                    r += n;
                }
            }


            if (r == i) {
                System.out.println("perfect number " + i);
            }
        }
    }
}
