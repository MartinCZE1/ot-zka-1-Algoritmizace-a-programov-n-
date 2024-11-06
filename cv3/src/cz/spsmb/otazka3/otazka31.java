package cz.spsmb.otazka3;

import java.util.Scanner;

public class otazka31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej čísla");
        String numbers = sc.nextLine();

        char[] numberChars = numbers.toCharArray();

        if (numberChars[0] == numberChars[1] && numberChars[1] == numberChars[2]) {
            System.out.println("true");
        } else {
            System.out.println("nn");
        }
    }
}
