package com.company;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String newWord = word.toLowerCase(Locale.ROOT);
        String[] letters = newWord.split("");

        System.out.print(Arrays.toString(letters));
        String[] reversed = new String[letters.length];

        for (int i = letters.length - 1; i >= 0; i--) {
            int index = letters.length - 1 - i;
            reversed[index] = letters[i];
        }
        System.out.println(Arrays.toString(reversed));

        if (letters[0].equalsIgnoreCase(reversed[0])) {
            if (letters[1].equalsIgnoreCase(reversed[1])) {
                System.out.println("Има огледална част. \n " +
                        " Да, започва с \"" + letters[0] + letters[1] + "\" и завършва с \"" + reversed[1] + reversed[0] + "\"");
            } else if (!letters[1].equalsIgnoreCase(reversed[1])) {
                System.out.println("Има огледална част. \n"+
                        "Да, започва и свършва с \"" + letters[0] + "\"");
            }
        } else {
            System.out.println("Няма огледална част \n" +
                    " Не, започва с \"" + letters[0] + "\", а завършва с \"" + reversed[0] +"\"");
        }

    }
}
