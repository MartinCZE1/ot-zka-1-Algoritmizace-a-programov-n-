package cz.spsmb.otazka2;

import java.util.Scanner;

public class otazka22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dej vetu");
        String veta = sc.nextLine();
        char chars[] = veta.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            String xd = chars.toString();
            System.out.println(xd);
        }
    }
}
