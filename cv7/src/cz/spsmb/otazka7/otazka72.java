package cz.spsmb.otazka7;

import java.util.Scanner;

public class otazka72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.println(i + " * " + j + " = " + i*j);
            }
        }
    }
}
