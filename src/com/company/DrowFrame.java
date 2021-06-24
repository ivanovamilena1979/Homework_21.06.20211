package com.company;

import java.util.Scanner;

public class DrowFrame {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n>3: ");
        int n = in.nextInt();
        drawFrameMethod(n);

    }

    public static void drawFrameMethod(int n) {
        if (n < 3) {
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print(" ? ");
            } else System.out.print(" - ");
        }
        System.out.println(" ");
        for (int j = 0; j < n - 2; j++) {
            System.out.print(" | ");
            for (int i = 2; i < n; i++) {

                System.out.print(" - ");
            }
            System.out.println(" | ");

        }
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == n) {
                System.out.print(" ? ");
            } else System.out.print(" - ");
        }
        System.out.println(" ");
    }
}