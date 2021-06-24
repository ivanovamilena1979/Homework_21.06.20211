package com.company;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text here: ");
        String text = in.nextLine();
        text = text.toLowerCase();
        if (checkMirroredLetters(text)){
            System.out.println(": The text is mirrored");}
        else System.out.println("No mirrored part");

    }

public static boolean checkMirroredLetters(String text){
        int j = text.length() - 1;
        if (text.charAt(0) != (text.charAt(j))) {

            return false;
        } else {

        for (int i = 0; i < text.length(); i++) {


            if (text.charAt(i) == (text.charAt(j))) {


                System.out.print(text.charAt(i));


            } else break;
            j--;

        }

    }return true;
}}


