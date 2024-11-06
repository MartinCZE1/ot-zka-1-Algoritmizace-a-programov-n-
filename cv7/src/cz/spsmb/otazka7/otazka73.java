package cz.spsmb.otazka7;

import java.util.Scanner;

public class otazka73 {
    public static void main(String[] args) {
        int x = 0;
        int suda = 0;
        int licha = 0;
        Scanner sc = new Scanner(System.in);
        do {
            x = sc.nextInt();
            if (x % 2 == 0) {
                suda++;
            } else {
                licha++;
            }
            System.out.println("Sudá: " + suda);
            System.out.println("Lichá: " + licha);
        } while (x != 0);
    }
}
