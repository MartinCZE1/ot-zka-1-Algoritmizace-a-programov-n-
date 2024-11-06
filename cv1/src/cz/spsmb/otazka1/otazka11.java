package cz.spsmb.otazka1;

import java.util.Scanner;

public class otazka11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cislo pls");
        int number = sc.nextInt() - 1;

        for (int i = 0; i < number; i++) {
            System.out.println("*");
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
        }

        for (int i = number - 1; i >= 0; i--) {
            System.out.println("*");
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
        }
        System.out.println("*");
    }
}
