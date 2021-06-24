package com.company;

import java.util.Scanner;

public class WordsEndingToYAndZ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text here: ");
        String text = in.nextLine();

        getLastChar(text);

    }

    static void getLastChar(String text) {


        text = text + " ";
        int count = 0;
        for (int i = 1; i < text.length(); i++) {


            if (text.charAt(i) == ' ')


                if (text.charAt(i - 1) == 'y' || text.charAt(i - 1) == 'z') {
                    count++;

                }
        }
        System.out.println("Number of words ending to 'z' or 'y': " + count);
    }


}


