package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = in.nextInt();
        int i, j;
        char symbol = '!';

        for (i = n; i > 0; i--) {
            for (j = i; j <= n; j++) {
                System.out.print(symbol);
            }

            System.out.println();
        }
    }
}



