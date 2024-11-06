package cz.spsmb.otazka1;

import java.util.Scanner;

public class otazka12_a_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej slovo a já to napíšu pozpátku");
        String word = sc.nextLine();
        int x = 0;

        char chars[] = word.toCharArray();
        for (int i = chars.length; i > 0; i--) {
            System.out.print(chars[i - 1]);
        }

        System.out.println();
        System.out.println("Zadej větu a já spočítám, jak dlouhé to je");
        String sentence = sc.nextLine();
        System.out.println(sentence.split(" ").length);
    }
}

