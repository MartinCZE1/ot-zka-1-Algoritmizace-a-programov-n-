package cz.spsmb.otazka3;

import java.util.Scanner;

public class otazka32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dej první číslo:");
        int first = sc.nextInt();

        System.out.println("dej druhé číslo:");
        int second = sc.nextInt();

        if (first == 0 && second == 0){
            System.out.println(first + " AND "+ second + " = 0");
            System.out.println(first + " OR "+ second + " = 0");
            System.out.println(first + " XOR "+ second + " = 0");
        } else if ((first == 0 && second == 1) || (first == 1 && second == 0)) {
            System.out.println(first + " AND "+ second + " = 0");
            System.out.println(first + " OR "+ second + " = 1");
            System.out.println(first + " XOR "+ second + " = 1");
        } else {
            System.out.println(first + " AND "+ second + " = 1");
            System.out.println(first + " OR "+ second + " = 1");
            System.out.println(first + " XOR "+ second + " = 0");
        }
    }
}
